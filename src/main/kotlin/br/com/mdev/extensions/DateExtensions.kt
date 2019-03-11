package br.com.mdev.extensions

import java.text.DateFormat
import java.util.*

fun Date.shortDate(locale: Locale? = null) =
    DateFormat.getDateInstance(DateFormat.SHORT, locale.getLocale())
        .format(this)
        .toString()