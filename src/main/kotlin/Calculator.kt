class Calculator {

    fun printMenu() {
        println("=================")
        println("1. 덧셈")
        println("2. 뺄셈")
        println("3. 곱셈")
        println("4. 나눗셈")
        println("-1. 종료")
        println("=================")
    }

    fun printNotice(menu: Int) {
        if (menu !in listOf(1, 2, 3, 4, -1)) {
            println("입력한 값은 유효한 숫자가 아닙니다.")
        }
    }

    fun getInput(): Int {
        println("숫자를 입력해주세요.")
        val num = readln().toIntOrNull()
        return num ?: 0
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int? {
        if (b == 0) {
            println("0으로 나눌 수 없습니다.")
            return null
        }
        return a / b
    }

}