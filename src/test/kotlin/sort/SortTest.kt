package sort

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo

class SortTest {

    private lateinit var sorters: List<Sort>
    private lateinit var array: Array<Int>

    @BeforeEach
    internal fun setUp(info: TestInfo) {
        sorters = listOf(BubbleSort(), SelectionSort())
        println("<------------>")
        println(info.displayName.toUpperCase().removeSuffix("()"))
    }

    @Test
    fun `empty array`() {
        runTest(input = arrayOf(), expected = arrayOf())
    }

    @Test
    fun `single element array`() {
        runTest(input = arrayOf(1), expected = arrayOf(1))
    }

    @Test
    fun `two element array`() {
        runTest(input = arrayOf(2, 1), expected = arrayOf(1, 2))
    }

    @Test
    fun `three element array`() {
        runTest(input = arrayOf(2, 1, 3), expected = arrayOf(1, 2, 3))
    }

    @Test
    fun `already ordered`() {
        runTest(input = arrayOf(1, 2, 3, 4, 5), expected = arrayOf(1, 2, 3, 4, 5))
    }

    @Test
    fun `reverse order`() {
        runTest(input = arrayOf(5, 4, 3, 2, 1), expected = arrayOf(1, 2, 3, 4, 5))
    }

    @Test
    fun `random order`() {
        runTest(input = arrayOf(2, 1, 5, 3, 4), expected = arrayOf(1, 2, 3, 4, 5))
    }

    private fun runTest(input: Array<Int>, expected: Array<Int>) {
        sorters.forEach {
            array = input
            print("\n${it.javaClass.simpleName}: [${array.joinToString()}] -> ")

            val sorted = it.sort(array.clone())
            println("[${sorted.joinToString()}]")

            assert(sorted.contentEquals(expected))
        }
    }
}