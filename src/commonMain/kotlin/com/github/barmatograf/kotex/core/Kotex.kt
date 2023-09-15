package com.github.barmatograf.kotex.core

import com.github.barmatograf.kotex.implementations.KotexBuilderImpl
import com.github.barmatograf.kotex.implementations.KotexImpl
import kotlinx.coroutines.CoroutineDispatcher

interface Kotex {
    val dispatcher: CoroutineDispatcher
}

interface KotexBuilder {
    var dispatcher: CoroutineDispatcher?
}

fun kotex(block: KotexBuilder.() -> Unit = {}): Kotex {
    val builder = kotexBuilder().apply(block)
    return KotexImpl(requireNotNull(builder.dispatcher))
}

private fun kotexBuilder(): KotexBuilder {
    return KotexBuilderImpl()
}
