package com.github.barmatograf.kotex.implementations

import com.github.barmatograf.kotex.core.KotexBuilder
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

data class KotexBuilderImpl(override var dispatcher: CoroutineDispatcher? = Dispatchers.Default) : KotexBuilder
