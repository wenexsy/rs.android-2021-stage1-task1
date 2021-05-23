package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) {
            return sadArray
        }
        val ferstArray = sadArray.reversedArray()
        val newArray = arrayListOf(ferstArray[0])
        var left = 0

        for (i in 1 until ferstArray.lastIndex) {
            if (ferstArray[i] <= (ferstArray[left] + ferstArray[i + 1])) {
                newArray.add(ferstArray[i])
                left = i
            }
        }
        newArray.add(ferstArray[ferstArray.lastIndex])
        return newArray.toIntArray().reversedArray()
    }
}
