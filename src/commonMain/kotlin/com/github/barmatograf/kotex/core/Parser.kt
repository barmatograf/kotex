package com.github.barmatograf.kotex.core

typealias Parser<Token, Entity> = Context<Token>.() -> Entity
