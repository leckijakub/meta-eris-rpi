
SUMMARY = "Nordic Semiconductor nrfutil utility and Python library"
HOMEPAGE = "https://github.com/NordicSemiconductor/pc-nrfutil"
AUTHOR = "Nordic Semiconductor ASA <>"
LICENSE = "Closed"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e9df9ce515a549de0523956ebef8304"

SRC_URI[sha256sum] = "cdeb5155cd65ef62c196642cfab9a2abd65fc61ce77439b1a4549f68bfc2ffb6"

PYPI_PACKAGE = "nrfutil"

inherit pypi setuptools3

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-ipaddress \
    ${PYTHON_PN}-click \
    ${PYTHON_PN}-crcmod \
    ${PYTHON_PN}-ecdsa \
    ${PYTHON_PN}-intelhex \
    ${PYTHON_PN}-pc-ble-driver-py \
    ${PYTHON_PN}-protobuf \
    ${PYTHON_PN}-pyserial \
    ${PYTHON_PN}-tqdm \
    ${PYTHON_PN}-pyyaml \
    ${PYTHON_PN}-pyspinel \
    ${PYTHON_PN}-terminal \
"
