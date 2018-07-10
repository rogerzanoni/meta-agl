SUMMARY = "Binding embedding test framework to test others binding"
DESCRIPTION = "This make testing binding running with Application Framework binder \
easier by simply test verb return as well as event reception."
HOMEPAGE = "https://gerrit.automotivelinux.org/gerrit/#/admin/projects/apps/app-afb-test"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
SECTION = "apps"

SRC_URI = "gitsm://gerrit.automotivelinux.org/gerrit/apps/app-afb-test;protocol=https;branch=${AGL_BRANCH}"
SRCREV = "bc634e0d890f8f3f51205f95187f639f73e864a7"

DEPENDS += "lua"
RDEPENDS_${PN} += "lua bash"
RDEPENDS_${PN}-ptest += "af-binder"

PV = "5.99-FF.RC4.0+git${SRCPV}"
S  = "${WORKDIR}/git"

inherit cmake aglwgt pkgconfig ptest

do_install_append() {
	install -d ${D}${bindir}
	install -m 775 ${B}/afm-test ${D}${bindir}/afm-test
}

