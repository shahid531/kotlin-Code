package org.example

public open class Engine(open val name:String,open val color:String) {

    protected open fun v8Engine() {
        println("V8 Engine is most powerful engine...")
    }

    override fun toString(): String {
        return "Engine(name=$name,color=$color)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Engine) return false
        return name==other.name && color==other.color
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}