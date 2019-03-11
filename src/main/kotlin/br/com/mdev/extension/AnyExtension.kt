package br.com.mdev.extension

fun <T : Any> T?.whenNotNull(f: (it: T) -> Unit) {
    if (this != null) f(this)
}