package com.easykotlin.lec03_kotlin_extensions

fun main(args: Array<String>) {
    val array = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    array.swap(0, array.size - 1)
    array.forEach { print("$it,") }



    println()

    println(array.sum)

    val map = hashMapOf(1 to "A", 3 to "C", 2 to "B")
    println(map.toSortedMap())
    println(map.toSortedMap(compareBy { it }))

    val m1 = map.orderByKeyAsc()
    println(m1)
    val m2 = map.orderByKeyDesc()
    println(m2)
    val m3 = map.orderByValueAsc()
    println(m3)
    val m4 = map.orderByValueDesc()
    println(m4)
}

