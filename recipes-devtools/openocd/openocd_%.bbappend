FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://rpi1.cfg \
"

EXTRA_OECONF += "--enable-sysfsgpio --enable-bcm2835gpio"

do_install:append(){
    install -m 644 ${WORKDIR}/rpi1.cfg ${D}${datadir}/rpi1.cfg
}

FILES:${PN} += "\
    ${datadir}/rpi1.cfg \
"
