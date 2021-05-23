package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var count: Int
        var temp: Int
        val result = arrayListOf<String>()
        for (i in 0..inputString.lastIndex) {
            when(inputString[i]) {
                '<' -> {
                    count = 0
                    temp = i + 1
                    for (j in i..inputString.lastIndex) {
                        if (inputString[j] == '<') {
                            count += 1
                        }
                        if (inputString[j] == '>') {
                            count -= 1
                            if (count == 0) {
                                result.add(inputString.substring(temp until j))
                                break
                            }
                        }
                    }
                }
                '(' -> {
                    count = 0
                    temp = i + 1
                    for (j in i..inputString.lastIndex) {
                        if (inputString[j] == '(') {
                            count += 1
                        }
                        if (inputString[j] == ')') {
                            count -= 1
                            if (count == 0) {
                                result.add(inputString.substring(temp until j))
                                break
                            }
                        }
                    }
                }
                '[' -> {
                    count = 0
                    temp = i + 1
                    for (j in i..inputString.lastIndex) {
                        if (inputString[j] == '[') {
                            count += 1
                        }
                        if (inputString[j] == ']') {
                            count -= 1
                            if (count == 0) {
                                result.add(inputString.substring(temp until j))
                                break
                            }
                        }
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}
