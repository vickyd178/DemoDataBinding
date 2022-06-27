package com.doops.demodatabinding.utils

import androidx.core.widget.NestedScrollView
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton


fun NestedScrollView.enableAutoFabShrink(fab: ExtendedFloatingActionButton) {
    setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { _, _, scrollY, _, oldScrollY ->
        // the delay of the extension of the FAB is set for 1
        if (scrollY > oldScrollY + 1 && fab.isExtended) {
            fab.shrink()
        }

        // the delay of the extension of the FAB is set for 1
        if (scrollY < oldScrollY - 1 && !fab.isExtended) {
            fab.extend()
        }

        // if the nestedScrollView is at the first item of the list then the
        // extended floating action should be in extended state
        if (scrollY == 0) {
            fab.extend()
        }
    })
}