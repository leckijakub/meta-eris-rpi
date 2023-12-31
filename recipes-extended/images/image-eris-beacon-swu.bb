DESCRIPTION = "Recipe generating SWU image for RTE"
SECTION = ""

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

# Add all local files to be added to the SWU
# sw-description must always be in the list.
# You can extend with scripts or wahtever you need
SRC_URI = " \
    file://sw-description \
    "

# images to build before building swupdate image
IMAGE_DEPENDS = " \
    image-eris-beacon \
    "

# images and files that will be included in the .swu image
SWUPDATE_IMAGES = " \
    image-eris-beacon \
    "

# a deployable image can have multiple format, choose one
SWUPDATE_IMAGES_FSTYPES[image-eris-beacon] = ".direct.p2.gz"

inherit swupdate
