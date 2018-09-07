package sort

fun Array<Int>.swap(firstIndex: Int, secondIndex: Int) {
    val temp = this[firstIndex]
    this[firstIndex] = this[secondIndex]
    this[secondIndex] = temp
}