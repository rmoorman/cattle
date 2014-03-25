#!/bin/bash

cd $(dirname $0)

if [ "$EC2_TEST" != "true" ]; then
    exit 0
fi

if [ ! -x "$(which aws)" ]; then
    sudo pip install awscli
fi

if [ ! -e key.pub ]; then
    ssh-keygen -t rsa -f key -N ''
fi

cat > user-data << EOF
#!/bin/bash

terminate()
{
    sleep 3000
    poweroff -f
}

setup()
{
    mkdir -p /root/.ssh
    mkdir -p /mnt/dstack
    mkdir -p /mnt/dstack-src
    ln -s /mnt/dstack /var/lib
    ln -s /mnt/dstack-src /usr/src/dstack
    cd /usr/src/dstack
    add-apt-repository -y ppa:fkrull/deadsnakes

    apt-get update
    apt-get install git
    git clone https://github.com/ibuildthecloud/dstack.git .

    echo '$(<key.pub)' > /root/.ssh/authorized_keys
    curl -sL https://get.docker.io/ | sh
    apt-get install -y python-eventlet python-pip libvirt-dev libvirt-bin python-dev python2.6-dev qemu-kvm python-libvirt
    if [ ! -e /usr/lib/libvirt-lxc.so ]; then
        ln -s /usr/lib/libvirt-lxc.so.0 /usr/lib/libvirt-lxc.so
    fi
    pip install --upgrade pip tox

    touch /var/tmp/setup-done
}

terminate &
setup 2>&1 | tee /var/log/setup.log
EOF

# 12.04 doesn't work, libvirt is too old for testing
#AMI=${AMI:-ami-a498a4e1}
AMI=${AMI:-ami-d8ac909d}
ID=$(aws ec2 run-instances --image-id $AMI                              \
                      --security-group-ids all                          \
                      --user-data file://user-data                      \
                      --instance-initiated-shutdown-behavior terminate  \
                      --query 'Instances[0].InstanceId'                 \
                      --output text)

echo $ID > ec2-id
