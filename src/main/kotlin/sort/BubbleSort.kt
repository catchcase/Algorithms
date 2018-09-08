package sort

class BubbleSort : Sort {
    override fun sort(dataSet: Array<Int>): Array<Int> {
        if (dataSet.size < 2) {
            return dataSet
        }

        var rightIndex = dataSet.lastIndex

        for (i in 0..dataSet.size) {
            while (rightIndex - 1 >= 0) {
                if (dataSet[rightIndex - 1] > dataSet[rightIndex]) {
                    dataSet.swap(rightIndex - 1, rightIndex)
                }
                rightIndex--
            }
            rightIndex = dataSet.lastIndex
        }

        return dataSet
    }
}