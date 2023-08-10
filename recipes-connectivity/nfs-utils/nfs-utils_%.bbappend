FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://exports \
"

do_install:append() {
    install -d ${D}${sysconfdir}/
    install -m 644 ${WORKDIR}/exports ${D}${sysconfdir}/
}

FILES:${PN} += " \
    ${sysconfdir}/exports \
"
