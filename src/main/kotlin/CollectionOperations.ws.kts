val array = listOf(22, 55, 77, 88, 22, 88)
// Average
array.average()

// Median
array
    .sorted()
    .let {
        (it[it.size / 2] + it[(it.size - 1) / 2]) / 2
    }

// Mode
val sortedByFrequency = array
    .groupBy { it }
    .entries
    .sortedByDescending { it.value.size }
val maxFrequency = sortedByFrequency.first().value.size
sortedByFrequency
    .takeWhile { it.value.size == maxFrequency }
    .map { it.key }


