package br.com.mdev.extensions

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.SimpleDateFormat
import java.util.*

class DateExtensionTest {

    @Test
    fun must_ShowRightDateString_WhenUseShortDateExtension() {

        val sdf = SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
        val date = sdf.parse("01/01/2019 00:00:00")
        assertEquals("1/1/19", date.shortDate(Locale.ENGLISH))
    }
}