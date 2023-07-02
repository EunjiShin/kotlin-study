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

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Float {
        if (b == 0) {
            throw IllegalArgumentException("cannot divide by 0");
        }
        return a.toFloat() / b.toFloat()
    }

}