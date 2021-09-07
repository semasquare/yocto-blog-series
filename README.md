# Building your own images for Raspberry Pi using Yocto 

This project serves as the codebase for our second blog article dedicated to the Yocto Project.
It provides all necessary configurations  to build a `core-image-minimal` of the poky distribution.
A `hello-world-image`, which includes an C written Hello-World cli-program is also part of this repository.
Both images are configured to run on an Raspberry Pi 4.
You can find out more about the process to this finished project in this article: <link>

Initialize this repository:
```
cd sources
git clone -b dunfell git://git.yoctoproject.org/poky
git clone -b dunfell git://git.yoctoproject.org/meta-raspberrypi
git clone -b dunfell git://git.openembedded.org/meta-openembedded
```

To build the 'minimal-core-image' execute the following commands:

```
cd ../artifacts
source ../sources/poky/oe-init-build-env
bitbake core-image-minimal
```

Same goes for the hello-world-image:

``` 
cd ../artifacts
source ../sources/poky/oe-init-build-env
bitbake core-image-minimal
```

Note: Use the MACHINE environment variable to overwrite the machine configuration any other Raspberry Pi Model:
For example: `MACHINE=raspberrypi3-64 bitbake core-image-minimal`
