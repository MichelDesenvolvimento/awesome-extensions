package br.com.mdev.extension

import java.util.*

fun Locale?.getLocale() = this ?: Locale.getDefault()