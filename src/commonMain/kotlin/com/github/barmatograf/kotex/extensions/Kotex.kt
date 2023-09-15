package com.github.barmatograf.kotex.extensions

import com.github.barmatograf.kotex.core.IndexedSource
import com.github.barmatograf.kotex.core.Kotex
import com.github.barmatograf.kotex.core.Parser
import com.github.barmatograf.kotex.core.Report

fun <Token> Kotex.match(source: IndexedSource<Token>, parser: Parser<Token, *>): Boolean {
    TODO()
}

fun <Token, Entity> Kotex.parse(source: IndexedSource<Token>, parser: Parser<Token, Entity>): Report<Entity> {
    TODO()
}

fun <Token, Entity> Kotex.parseAll(source: IndexedSource<Token>, parser: Parser<Token, Entity>): List<Report<Entity>> {
    TODO()
}
