package br.com.mdev.extensions

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.regex.Pattern

fun String.toDate(format: String) = try {
    SimpleDateFormat(format).parse(this)
} catch (exception: ParseException) {
    null
}