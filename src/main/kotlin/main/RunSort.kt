package main

import sort.BubbleSort

fun main(args: Array<String>) {
    println(BubbleSort().sort(arrayOf(1, 3, 2, 5, 4)).joinToString(", "))
}