package br.com.mdev.extensions

import java.util.*

fun Locale?.getLocale() = this ?: Locale.getDefault()