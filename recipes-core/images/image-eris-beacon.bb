SUMMARY = "ERIS environment software for beacon remote access platform (RAP)"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "minicom usbip-server swupdate u-boot-env sshd dhcpcd python3-nrfutil systemd-analyze"
