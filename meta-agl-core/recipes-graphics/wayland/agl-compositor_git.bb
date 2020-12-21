SUMMARY = "Reference Wayland compositor for AGL"
DESCRIPTION = "The AGL compositor is a reference Wayland server for Automotive \
Grade Linux, using libweston as a base to provide a graphical environment for \
the automotive environment."

HOMEPAGE = "https://gerrit.automotivelinux.org/gerrit/q/project:src%252Fagl-compositor"
SECTION = "x11"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=fac6abe0003c4d142ff8fa1f18316df0"

DEPENDS = "wayland wayland-protocols wayland-native weston"

SRC_URI = "git://gerrit.automotivelinux.org/gerrit/src/agl-compositor.git;protocol=https;branch=${AGL_BRANCH}"
SRCREV = "bdd8dd718496dc8e4330209c46c196442bcf7d3e"

PV = "0.0.10+git${SRCPV}"
S = "${WORKDIR}/git"

PACKAGECONFIG[policy-deny-all] = "-Dpolicy-default=deny-all,,"

inherit meson pkgconfig python3native

FILES_${PN} = " \
               ${bindir}/agl-compositor \
               ${bindir}/agl-screenshooter \
               ${datadir}/${PN}/protocols/agl-shell.xml \
               ${datadir}/${PN}/protocols/agl-shell-desktop.xml \
              "