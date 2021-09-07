DESCRIPTION = "Hello-World Application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hello-world.c"

S = "${WORKDIR}"

do_compile() {
        ${CC} ${CFLAGS} ${LDFLAGS} ${S}/hello-world.c -o ${S}/hello-world
}

do_install() {
        install -d ${D}${bindir}
        install -m 0755 ${S}/hello-world ${D}${bindir}
}

