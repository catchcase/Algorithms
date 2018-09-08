package sort

class SelectionSort : Sort {
    override fun sort(dataSet: Array<Int>): Array<Int> {
        if (dataSet.size < 2) {
            return dataSet
        }

        for (i in 0 until dataSet.size) {
            var minIndex = i

            for (j in i + 1 until dataSet.size) {
                if (dataSet[j] < dataSet[minIndex]) {
                    minIndex = j
                }
            }

            dataSet.swap(i, minIndex)
        }

        return dataSet
    }
}