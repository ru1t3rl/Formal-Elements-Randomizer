package tech.lucar.formalelementsrandomizer.data.formalelements

import kotlin.random.Random

abstract class BaseElement {
    protected abstract val elements: List<String>
    fun GetElements() : List<String> {
        return elements
    }

    fun GetRandomElement(): String {
        return elements[Random.nextInt(0, elements.count())]
    }
}