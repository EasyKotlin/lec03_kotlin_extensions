package com.easykotlin.lec03_kotlin_extensions

object MyUtilsKt {

    /**
     * 把字符串中空白字符转换成 _
     */
    fun convertSpace2Underscore(s: String): String {
        return s.replace(" ".toRegex(), "_")
    }

}

fun main(args: Array<String>) {
    val str = "This is a Kotlin Demo"
    val convertedStr = MyUtilsKt.convertSpace2Underscore(str)
    println(convertedStr)

    val convertedStr2 = "This is another Kotlin Demo".convertSpace2Underscore()
    println(convertedStr2)

    val convertedStr3 = "This is another Kotlin Demo".convertSpace2Underscore2()
    println(convertedStr3)

    println(str.firstChar())

    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.sum
    println(sum)

    val result = list.filter {
        it % 2 == 0
    }
    println(result)

    println("ls -R".exe())



    val sepResult = "This is another Kotlin Demo" convertSpace2Underscore "$"
    println(sepResult) // This$is$another$Kotlin$Demo
}

fun String.exe(): String {
    val cmd = this
    val p = Runtime.getRuntime().exec(cmd)
    val ins = p.inputStream
    var lines = ""
    val br = ins.bufferedReader()
    var line: String?
    do {
        line = br.readLine()
        lines += line + "\n"
    } while (line != null)
    return lines
}

fun String.convertSpace2Underscore() = this.replace(" ", "_")
infix fun String.convertSpace2Underscore(sep: String) = this.replace(" ", sep)
//内联函数
inline fun String.convertSpace2Underscore2() = this.replace(" ", "_")
//infix


/**
 * 获取一个字符串的首字符
 */
fun String.firstChar(): String? {
    val s = this
    return if (s != null && s.length > 0) {
        s[0] + ""
    } else null
}

val List<Int>.sum: Int
    get() {
        var sum = 0
        this.forEach { sum += it }
        return sum
    }


fun <T> List<T>.filter(p: (T) -> Boolean): MutableList<T> {
    var result = mutableListOf<T>()
    for (t in this) {
        if (p(t)) {
            result.add(t)
        }
    }
    return result
}