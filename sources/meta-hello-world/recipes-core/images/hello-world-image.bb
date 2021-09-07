SUMMARY = "Core Image including Hello-World Application"
DESCRIPTION = " This is the core-image-minimal with an additional hello-world application and core cli tools"

LICENSE="CLOSED"

inherit core-image

IMAGE_INSTALL_append += " \
        hello-world \
"
