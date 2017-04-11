import kotlin.coroutines.experimental.buildSequence

fun getGreetings(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("World!")
    return words.joinToString(" ")
}

fun foo(ints: IntArray) {
    ints.forEach {
        if(it == 0) return
        print(it)
    }
}

fun foo1(ints: IntArray) {
    ints.forEach lit@ {
        if (it == 0) return@lit
        print(it)
    }
}

fun main(args: Array<String>) {
    println(getGreetings())
    val ints = intArrayOf(1,2,3,0,6,7,8)
    foo(ints)
    println()
    foo1(ints)
    println()
    println()
    val seq = buildSequence {
        for (i in 1..5) {
            // yield a square of i
            yield(i * i)
        }
        // yield a range
        yieldAll(26..28)
    }

// print the sequence
    println(seq.toList())
}