# meta-rpi3-robotics
Repository for holding an open embedded layer for testing Robotics

## local.conf configuration

After sourcing the oe-init-build-env, change the "DISTRO" variable at conf/local.conf:

DISTRO ?= 'robotics'

Another change that is recomended in order to avoid errors, at local.conf, is:

PACKAGE_CLASSES ?= "package_deb"

For some reason to be determined, using the default setting "package_rpm" was raising a error at the bitbake proccess.

## Available Images

The following images are available for build

1. rpi3-qt5-image
  This image is derived from "rpi-hwup-image", and includes the qt libraries at the target.
  
2. rpi3-qt5-ros-image
  This image is derived from rpi3-qt5-image and, along side with the qt5 packages, it cotains the ROS packages. In order to be able to compile this image, the "meta-ros" that needs to be cloned inside the "poky" folder is: https://github.com/rapyuta-robotics/meta-ros, what will ensure that the host developtment package can be built and the ros packages compiled at the target. Here for further information on how to cross-compile an ros package that can be deployed on the target
  
