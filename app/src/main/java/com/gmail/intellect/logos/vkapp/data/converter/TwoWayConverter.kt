package com.gmail.intellect.logos.vkapp.data.converter

interface TwoWayConverter<T, K> {

    fun convertTo(t: T): K

    fun convertFrom(k: K): T

}