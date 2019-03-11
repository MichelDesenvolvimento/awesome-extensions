package br.com.mdev.extension

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.regex.Pattern

fun String.toDate(format: String) = try {
    SimpleDateFormat(format).parse(this)
} catch (exception: ParseException) {
    null
}

fun String.isMacAddress(): Boolean {
    val t = Pattern.compile("^([0-9a-fA-F][0-9a-fA-F]:){5}([0-9a-fA-F][0-9a-fA-F])$")
    val match = t.matcher(this)
    return match.find()
}