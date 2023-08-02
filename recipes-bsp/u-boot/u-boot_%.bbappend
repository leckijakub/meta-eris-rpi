FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

FILES:${PN} += " \
    ${sysconfdir}/fw_env.config \
"
