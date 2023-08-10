SUMMARY = "ERIS environment software for main laboratory controller."

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "inetutils-tftpd nfs-utils"
IMAGE_INSTALL += "beacon-nfs-rootfs"
# base station packages for network boot
