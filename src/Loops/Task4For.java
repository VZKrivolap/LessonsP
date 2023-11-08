package Loops;
//Вычислить факториал числа, которое ввел пользователь.

import java.util.Scanner;

public class Task4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        int a = 1;
        System.out.print(factorial + "! = ");
        func(a,factorial);
    }

    public static void func(int a, int factorial){

        for (int i=1; i<=factorial; i++){
            a *= i;
            System.out.print(i); //!3 1 * 2 * 3   =   1 2 6
            if(i<factorial){
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + a);;
    }
}
