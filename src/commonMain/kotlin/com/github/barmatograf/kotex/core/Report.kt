package com.github.barmatograf.kotex.core

sealed interface Report<Entity> {

    interface Success<Entity> : Report<Entity> {
        val entity: Entity
    }

    interface Failure<Entity> : Report<Entity>

    interface Error<Entity> : Report<Entity> {
        val exception: Throwable
    }
}
