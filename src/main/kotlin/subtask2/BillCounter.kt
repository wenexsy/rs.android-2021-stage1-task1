package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billSumma = bill.sum()
        val annaBill = (billSumma - bill[k]) / 2
        return if (annaBill == b) {
            "Bon Appetit"
        } else {
            if (annaBill >= b) {
                "${annaBill - b}"
            } else {
                "${b - annaBill}"
            }
        }
    }
}
