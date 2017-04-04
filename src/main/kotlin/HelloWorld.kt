fun getGreetings(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("World!")
    return words.joinToString(" ")
}

fun main(args: Array<String>) {
    println(getGreetings())
}