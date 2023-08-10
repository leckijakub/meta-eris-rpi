DESCRIPTION = "NFS rootfs for ERIS beacon board"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS +="image-eris-beacon p7zip-native"

SRC_URI = " \
    file://beacon-nfs-rootfs.mount \
"

inherit systemd

SYSTEMD_SERVICE:${PN} = " \
    beacon-nfs-rootfs.mount \
"

do_install(){
    install -d ${D}/data/
    install -m 644 ${DEPLOY_DIR_IMAGE}/image-eris-beacon-eris-beacon-baseboard.ext4 ${D}/data/
    
    install -d ${D}/nfs/exports/beacon_root

    install -d ${D}${systemd_system_unitdir}
    install -m 600 ${WORKDIR}/beacon-nfs-rootfs.mount ${D}${systemd_system_unitdir}/
}

FILES:${PN} += " \
    /data/image-eris-beacon-eris-beacon-baseboard.ext4 \
    /nfs/exports/beacon_root \
    ${systemd_system_unitdir}/beacon-nfs-rootfs.mount \
"
