FILESEXTRAPATHS_prepend := "${THISDIR}/linux-yocto:"

# Backported fix for CVE-2017-1000364
SRC_URI_append = " file://4.4-0001-mm-larger-stack-guard-gap-between-vmas.patch \
                   file://4.4-0002-Allow-stack-to-grow-up-to-address-space-limit.patch \
                   file://4.4-0003-mm-fix-new-crash-in-unmapped_area_topdown.patch \
                 "
