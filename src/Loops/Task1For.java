package Loops;

//Вывести все квадраты натуральных чисел, не превосходящие данного числа N.
//
//Например, если N = 50, то на экран должен быть выведен ряд 1 4 9 16 25 36 49.

public class Task1For {
    public static void main(String[] args) {
        func(1, 50);
    }

    public static void func(int x, int n) {
        for (x = 1; x * x < n; x++) {
            System.out.println(x * x);
        }
    }
}