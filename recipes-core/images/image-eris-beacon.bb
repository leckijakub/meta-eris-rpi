SUMMARY = "ERIS environment software for beacon remote access platform (RAP)"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "minicom usbip-server openssh-sshd python3-nrfutil systemd-analyze"

IMAGE_FEATURES += "read-only-rootfs"
