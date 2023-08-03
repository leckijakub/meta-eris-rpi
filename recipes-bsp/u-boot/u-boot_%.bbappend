FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://boot-delay.cfg \
"

FILES:${PN} += " \
    ${sysconfdir}/fw_env.config \
"
