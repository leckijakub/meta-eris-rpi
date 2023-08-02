SUMMARY = "usbip server to share USB devices through network"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


SRC_URI = " \
    file://95-usbip-server.rules \
    file://usbip-share@.service \
    file://usbipd.service \
"

RDEPENDS:${PN} = "usbip-tools uhubctl"


do_install() {
    install -d ${D}/${sysconfdir}/udev/rules.d/
    install -m 0644 ${WORKDIR}/95-usbip-server.rules ${D}/${sysconfdir}/udev/rules.d/
    install -d ${D}/${systemd_system_unitdir}/
    install -m 0644 ${WORKDIR}/usbip-share@.service ${D}/${systemd_system_unitdir}/
    install -m 0644 ${WORKDIR}/usbipd.service ${D}/${systemd_system_unitdir}/
    install -d ${D}/data/usbipd.d/
    touch ${D}/data/usbipd.d/config
}

FILES:${PN} += " \
    ${sysconfdir}/udev/rules.d/* \
    ${systemd_system_unitdir}/* \
    /data/usbipd.d/config \
"
