package com.github.barmatograf.kotex.core

interface Context<Token> {

    fun token(): Token?

    fun <Item> repeat(from: Int, until: Int, block: () -> Item): List<Item>

    fun <Item> select(vararg blocks: () -> Item): Item
}
