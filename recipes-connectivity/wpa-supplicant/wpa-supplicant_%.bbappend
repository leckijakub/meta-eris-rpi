FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
        file://wpa_supplicant-wlan0.conf \
        file://wlan.network \
"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "wpa_supplicant@wlan0.service"

do_install:append () {
        install -d ${D}/${sysconfdir}/wpa_supplicant/
        install -m 644 ${WORKDIR}/wpa_supplicant-wlan0.conf ${D}/${sysconfdir}/wpa_supplicant/
        install -d ${D}${sysconfdir}/systemd/network
        install -m 644 ${WORKDIR}/wlan.network ${D}${sysconfdir}/systemd/network
}
