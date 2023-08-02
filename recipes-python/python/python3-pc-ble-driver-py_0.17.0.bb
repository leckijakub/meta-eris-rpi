
SUMMARY = "Nordic Semiconductor nrfutil utility and Python library"
HOMEPAGE = "https://github.com/NordicSemiconductor/pc-nrfutil"
AUTHOR = "Nordic Semiconductor ASA <>"
LICENSE = "Closed"

SRC_URI = "git://github.com/NordicSemiconductor/pc-ble-driver-py.git;branch=master;protocol=https"
SRCREV = "cc3a9d259b9363524823aa4a48dbe6991eca6bd7"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e9df9ce515a549de0523956ebef8304"

S = "${WORKDIR}/git"

DEPENDS += "python3 python3-scikit-build-native ninja-native swig-native catch2 pc-ble-driver"
# RDEPENDS:${PN} += "pc-ble-driver pc-ble-driver-staticdev"
inherit setuptools3

export CMAKE_PREFIX_PATH="${STAGING_DIR_TARGET}${datadir}/nrf-ble-driver"
