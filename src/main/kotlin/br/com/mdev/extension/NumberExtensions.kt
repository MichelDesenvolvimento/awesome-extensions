package br.com.mdev.extension

import java.text.NumberFormat
import java.util.*

fun Number.toMoneyString(locale: Locale? = null) =
    NumberFormat.getCurrencyInstance(locale.getLocale())
        .format(this)
        .toString()

fun Number.thousandSeparator(locale: Locale? = null) =
    NumberFormat.getNumberInstance(locale.getLocale())
        .format(this)
        .toString()