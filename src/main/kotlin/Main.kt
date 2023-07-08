fun main(args: Array<String>) {

    // 계산기 객체 생성
    val calculator = Calculator()

    // 무한반복 돌면서 연산 수행 -> -1 입력하면 종료
    generateSequence { calculator.printMenu(); readln().toInt() }
        .takeWhile { it != -1 }
        .forEach { menu ->
            calculator.printNotice(menu)

            val firstNum = calculator.getInput()
            val secondNum = calculator.getInput()

            val result = when (menu) {
                1 -> calculator.add(firstNum, secondNum)
                2 -> calculator.subtract(firstNum, secondNum)
                3 -> calculator.multiply(firstNum, secondNum)
                4 -> calculator.divide(firstNum, secondNum)
                else -> null
            }

            result?.let { println("결과는 $it 입니다.") }
        }

}