#Baseia a imagem na imagem rpi-basic-image.bb
include recipes-core/images/rpi-hwup-image.bb

LICENSE = "GPLv2"

PREFERRED_PROVIDER_jpeg = "libjpeg-turbo"
PREFERRED_PROVIDER_jpeg-native = "libjpeg-turbo-native"

#Adiciona features à imagem
IMAGE_FEATURES += " ssh-server-openssh"

RDEPENDS += " python-empy"

IMAGE_INSTALL_append = " \
	  roscpp-dev \
	  std-msgs-dev \
	  roslib \
	  roslaunch \
	  rostopic \
	  rosbag \
	  rosmaster \
	  catkin \
	"

TOOLCHAIN_HOST_TASK += "nativesdk-catkin"
