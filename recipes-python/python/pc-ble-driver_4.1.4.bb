
SUMMARY = "Nordic Semiconductor pc ble driver"
HOMEPAGE = "https://github.com/NordicSemiconductor/pc-ble-driver"
AUTHOR = "Nordic Semiconductor ASA <>"
LICENSE = "Closed"

SRC_URI = "git://github.com/NordicSemiconductor/pc-ble-driver.git;branch=master;protocol=https"
SRCREV = "749578b0b0b3f1c9df841dfd33949921df6cec56"
LIC_FILES_CHKSUM = "file://LICENSE;md5=772c3f93b8a2f4f2dec94ef7b9f434fb"

S = "${WORKDIR}/git"

DEPENDS += "spdlog catch2 asio udev"
inherit cmake

OECMAKE_CXX_FLAGS += "-include thread"
EXTRA_OECMAKE += "-DNRF_BLE_DRIVER_VERSION=4.1.4 -DCMAKE_BUILD_TYPE=Release"

FILES:${PN}-dev += "\
    ${datadir}/LICENSE \
    ${datadir}/nrf-ble-driver/* \
"
SYSROOT_DIRS += "${bindir}"
