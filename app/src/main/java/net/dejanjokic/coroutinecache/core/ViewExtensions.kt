package net.dejanjokic.coroutinecache.core

import android.view.View
import android.view.View.*

fun View.visible() {
    this.visibility = VISIBLE
}

fun View.invisible() {
    this.visibility = INVISIBLE
}

fun View.gone() {
    this.visibility = GONE
}