package org.example

data class Audi(override val name: String, override val color: String):Engine(name, color) {
}