package com.github.barmatograf.kotex

import com.github.barmatograf.kotex.core.kotex
import com.github.barmatograf.kotex.extensions.match
import com.github.barmatograf.kotex.extensions.parse

fun main() {
    val source = listOf('a', 'b', 'c').withIndex()
    val a = kotex().parse(source) {
        token()
    }
}
