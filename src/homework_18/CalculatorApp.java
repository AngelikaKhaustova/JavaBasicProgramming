package homework_18;

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Сумма двух чисел 1+1=" + Calculator.addition(1, 1));
        System.out.println("Разница двух чисел 17-7=" + Calculator.subtraction(17, 7));
        System.out.println("Результат умножения двух чисел 3*5=" + Calculator.multiplication(3, 5));
        System.out.println("Результат деления двух чисел 81/9=" + Calculator.division(81, 9));
          // HW 19 Task 1
        System.out.println("Длина окружности с радиусом 5="+ Calculator.circleLength(5));

        System.out.println("Площадь круга с радиусом 5=" + Calculator.circleArea(5));

    }



}
