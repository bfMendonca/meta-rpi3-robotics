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
