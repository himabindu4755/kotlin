package Basics

enum class State{ IDLE,CALLING, ANSWERED , RINGING}

fun main() {
    val state = State.CALLING
    val message =
        when(state)
    {
        State.IDLE ->"ITS IDLE"
            State.RINGING ->"ITS RINGING"
        else->"BYE"

    }
    println(state)
    println(message)
    println(State.CALLING.ordinal)
}
