FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://confirm-upgrade.service \
    file://rte-upgrade \
"

RDEPENDS:${PN} = "swu-confirm"

do_install:append() {
    install -d ${D}${sbindir}
    install -m 0700 ${WORKDIR}/rte-upgrade ${D}${sbindir}

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/confirm-upgrade.service ${D}${systemd_system_unitdir}/
}

FILES:${PN} += " \
    ${sbindir}/rte-upgrade \
    ${systemd_system_unitdir}/confirm-upgrade.service \
"

SYSTEMD_SERVICE:${PN} = " \
    confirm-upgrade.service \
"
