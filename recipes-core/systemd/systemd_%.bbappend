FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PACKAGECONFIG:remove = "nss-resolve resolved ldconfig timesyncd randomseed vconsole backlight"

SRC_URI += " \
    file://networkd.conf \
    file://99-beacon.network \
"

do_install:append() {
    install -d ${D}${sysconfdir}/systemd
    install -m 644 ${WORKDIR}/networkd.conf ${D}${sysconfdir}/systemd/

    install -d ${D}${sysconfdir}/systemd/network/
    install -m 644 ${WORKDIR}/99-beacon.network ${D}${sysconfdir}/systemd/network/00-beacon.network
}
