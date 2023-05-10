package mazerunner

enum class Cell {
    WALL,
    PASSAGE
}

fun main() {
    val list = List(10) { MutableList(10) { Cell.WALL } }
    repeat(9) { list[5][it] = Cell.PASSAGE }
    repeat(8) { list[1][it + 1] = Cell.PASSAGE }
    repeat(8) { list[3][it + 1] = Cell.PASSAGE }
    repeat(8) { list[7][it + 1] = Cell.PASSAGE }
    repeat(9) { list[it][5] = Cell.PASSAGE}

    list.forEach {
        it.forEach { element -> if (element == Cell.WALL) print("\u2588\u2588") else print("  ") }
        println()
    }
}