package com.gmail.intellect.logos.vkapp.data.converter

interface Converter<T, K> {

    fun convert(t: T): K


}