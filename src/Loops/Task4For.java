package Loops;
//Вычислить факториал числа, которое ввел пользователь.

import java.util.Scanner;

public class Task4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        int a = 1;
        for (int i=0; i<factorial; i++){
            a=a*factorial;
           }
        System.out.println(a);
    }
}
