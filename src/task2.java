public class task2 {
    /*Даны 3 переменные:
- operand1 (double)
- operand2 (double)
- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
Протестировать функцию в main.
Например:
Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
Результат: 34.5 (24.4 + 10.1)
   */
    public static void main(String[] args) {
        double operand1 = 10.1;
        double operand2 = 32.9;
        char operation = '+';
        getResult(operand1, operand2, operation);

    }
    public static void getResult(double a, double b, char c) {
        double result = (a + c + b);
        System.out.println(result);
    }

}
