fun main(args: Array<String>) {

    // 계산기 객체 생성
    val calculator = Calculator();

    // 무한 반복
    while(true) {

        // 메뉴 출력
        calculator.printMenu()
        val menu = readln().toInt()
        calculator.printNotice(menu)

        if (menu == -1) break;

        // 입력 받고
        val firstNum = calculator.getInput()
        val secondNum = calculator.getInput()

        // 조건문
        var result: Int? = 0
        when(menu) {
            1 -> result = calculator.add(firstNum, secondNum)
            2 -> result = calculator.subtract(firstNum, secondNum)
            3 -> result = calculator.multiply(firstNum, secondNum)
            4 -> result = calculator.divide(firstNum, secondNum)
        }

        println("결과는 $result 입니다.")

    }

}