package com.github.barmatograf.kotex.implementations

import com.github.barmatograf.kotex.core.Kotex
import kotlinx.coroutines.CoroutineDispatcher

class KotexImpl(override val dispatcher: CoroutineDispatcher) : Kotex
