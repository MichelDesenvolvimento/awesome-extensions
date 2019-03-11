package br.com.mdev.extensions

import java.text.ParseException
import java.text.SimpleDateFormat

fun String.toDate(format: String) = try {
    SimpleDateFormat(format).parse(this)
} catch (exception: ParseException) {
    null
}