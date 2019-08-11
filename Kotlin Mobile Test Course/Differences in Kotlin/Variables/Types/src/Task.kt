fun add(x: Int, y: Int): Int {
    var result = x
    for(i in 0 until y) {
        result++
    }
    return result
}

fun runAdd() {
    add(1, 1) // Anything that compiles
}