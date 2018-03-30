#Baseia a imagem na imagem rpi-basic-image.bb
include recipes-core/images/rpi-hwup-image.bb

LICENSE = "GPLv2"

PREFERRED_PROVIDER_jpeg = "libjpeg-turbo"
PREFERRED_PROVIDER_jpeg-native = "libjpeg-turbo-native"

#Adiciona features à imagem
IMAGE_FEATURES += " ssh-server-openssh"

IMAGE_INSTALL_append += " \
	  qtbase \
		qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
		\
		fontconfig \
    fontconfig-dev \
    fontconfig-utils \
    ttf-bitstream-vera \
	"

inherit populate_sdk_qt5
