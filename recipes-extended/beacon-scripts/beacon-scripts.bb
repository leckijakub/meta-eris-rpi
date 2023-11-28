SUMMARY = "Set of tools for working with the ERIS beacons"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

RDEPENDS:${PN} += "bash"

SRC_URI = "file://beacon_ctrl"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/beacon_ctrl ${D}${bindir}
}

FILES_${PN} += "${bindir}/beacon_ctrl"
