package Conditionals;
//Високосный год или нет
//С клавиатуры вводится год. Программа должна определять високосный это год или нет.
// Вывести на экран соответствующую надпись, а также количество дней в году.

// Если год равен например 2000, 2004, 2008, 2012, 2016, 2020, 2024 - такой год являетя високосным и в нем 366 дней.
// В иных случаях - не високосный и в нем 365 дней.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер года");
        int year = sc.nextInt();
        func(year);
    }

        public static void func(int year){
        if (year%4==0){
            System.out.println("Данный год является високосным. В нем 366 дней.");
        } else {
            System.out.println("Данный год не является високосным. В нем 365 дней.");
        }
    }
}
