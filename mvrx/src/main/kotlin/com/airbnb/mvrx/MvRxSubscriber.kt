package com.airbnb.mvrx

interface MvRxSubscriber<out T> {

    fun subscribe(subscriber: (T) -> Unit)
}
