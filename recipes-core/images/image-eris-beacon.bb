SUMMARY = "ERIS environment software for beacon remote access platform (RAP)"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "bash minicom usbip-server openssh-sshd openssh-scp python3-nrfutil openocd systemd-analyze rpi-gpio"

IMAGE_FEATURES += "read-only-rootfs"
