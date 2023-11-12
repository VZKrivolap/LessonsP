package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println();
        System.out.println("Введите операцию");
        char operation = scanner.next().charAt(0);

        if (operation == '+'){
            System.out.println("Результат вычисления : " +addition(number1, number2));
        } else if (operation == '-') {
            System.out.println("Результат вычисления : " + subtraction(number1, number2));
        }else if (operation == '*') {
            System.out.println("Результат вычисления : " + multiplication(number1, number2));
        } else if (operation == '/') {
            System.out.println("Результат вычисления : " + division(number1, number2));
        }
    }

public static int addition(int number1, int number2){
        int result=0;
        return result = number1+number2;
}

    public static int subtraction(int number1, int number2){
        int result=0;
        return result = number1-number2;
    }

    public static int multiplication(int number1, int number2){
        int result=0;
        return result = number1*number2;
    }

    public static int division(int number1, int number2){
        int result=0;
        return result = number1/number2;
    }

}