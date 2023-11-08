package Loops;

import java.util.Scanner;

//Вывести на экран ряд чисел Фибоначчи, состоящий из N элементов. Значение N вводится с клавиатуры.
//
//Числа Фибоначчи – это элементы числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …,
// в которой каждое последующее число равно сумме двух предыдущих.
public class Task5While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        func(n);
    }

    public static void func(int n){
        int x =0;
        int y=1;
        int fibonachi = 0;
        int i = 1;
        System.out.println(x);

        while (i<n) {
            fibonachi=x+y;
            y=x;
            x=fibonachi;
            System.out.println(fibonachi);
            i++;
        }
    }
}
