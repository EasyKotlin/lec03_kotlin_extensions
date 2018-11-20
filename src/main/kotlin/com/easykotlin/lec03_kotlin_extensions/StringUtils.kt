package com.easykotlin.lec03_kotlin_extensions


object StringUtilsKotlin {
    fun convertSpace2UnderScore(src: String): String {
        return src.replace(" ".toRegex(), "_")
    }
}


fun String.convertSpace2UnderScore(): String {
    return this.replace(" ".toRegex(), "_")
}

fun String.exe(): String {
    val cmd = this
    val p = Runtime.getRuntime().exec(cmd)
    val ins = p.inputStream
    val es = p.errorStream

    var inputLines = ""
    val brIns = ins.bufferedReader()
    var line: String?

    do {
        line = brIns.readLine()
        inputLines += "$line\n"
    } while (line != null)


    var errorLines = ""
    val brErr = es.bufferedReader()
    var errLine: String?
    do {
        errLine = brErr.readLine()
        errorLines += "$errLine\n"
    } while (errLine != null)


    return "$inputLines\n$errorLines"

}