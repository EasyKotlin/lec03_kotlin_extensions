package com.easykotlin.lec03_kotlin_extensions

import java.util.*


/**
 * 扩展函数:
 * 是指在一个类上增加一种新的行为，甚至我们没有这个类代码的访问权限。
 *
 */

fun MutableList<Int>.swap(src: Int, target: Int) {  // 函数的接收者 this
    val temp = this[src]
    this[src] = this[target]
    this[target] = temp
}

// 扩展属性
val MutableList<Int>.sum: Int
    get() {
        var sum = 0
        this.forEach { sum += it }
        return sum
    }


fun <K, V : Comparable<V>> HashMap<K, V>.orderByValueAsc(): List<Map.Entry<K, V>> {
    return this.map { it }.sortedBy { it.value }
}

fun <K, V : Comparable<V>> HashMap<K, V>.orderByValueDesc(): List<Map.Entry<K, V>> {
    return this.map { it }.sortedByDescending { it.value }
}

fun <K : Comparable<K>, V> HashMap<K, V>.orderByKeyAsc(): List<Map.Entry<K, V>> {
    return this.map { it }.sortedBy { it.key }
}

fun <K : Comparable<K>, V> HashMap<K, V>.orderByKeyDesc(): List<Map.Entry<K, V>> {
    return this.map { it }.sortedByDescending { it.key }
}