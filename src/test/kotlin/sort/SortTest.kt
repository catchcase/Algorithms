package sort

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SortTest {

    lateinit var sorters: List<Sort>

    @BeforeEach
    internal fun setUp() {
        sorters = listOf(BubbleSort())
    }

    @Test
    fun `empty array`() {
        val array: Array<Int> = arrayOf()

        sorters.forEach { assert(it.sort(array).contentEquals(arrayOf())) }
    }

    @Test
    fun `single element array`() {
        val array: Array<Int> = arrayOf(1)

        sorters.forEach { assert(it.sort(array).contentEquals(arrayOf(1))) }
    }

    @Test
    fun `two element array`() {
        val array: Array<Int> = arrayOf(2, 1)

        sorters.forEach { assert(it.sort(array).contentEquals(arrayOf(1, 2))) }
    }

    @Test
    fun `three element array`() {
        val array: Array<Int> = arrayOf(2, 1, 3)

        sorters.forEach { assert(it.sort(array).contentEquals(arrayOf(1, 2, 3))) }
    }

    @Test
    fun `already ordered`() {
        val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)

        sorters.forEach { assert(it.sort(array).contentEquals(arrayOf(1, 2, 3, 4, 5))) }
    }

    @Test
    fun `reverse order`() {
        val array: Array<Int> = arrayOf(5, 4, 3, 2, 1)

        sorters.forEach { assert(it.sort(array).contentEquals(arrayOf(1, 2, 3, 4, 5))) }
    }

    @Test
    fun `random order`() {
        val array: Array<Int> = arrayOf(2, 1, 5, 3, 4)

        sorters.forEach { assert(it.sort(array).contentEquals(arrayOf(1, 2, 3, 4, 5))) }
    }
}