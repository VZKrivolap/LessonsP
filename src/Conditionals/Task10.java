package Conditionals;
//Компьютер загадывает случайное число в диапазоне от 1 до 10(Math.random).
//Твоя задача задача угадывать число пока не угадаешь. Дополнительно: угадать число за 4 хода и рассказать как ты это сделал.
// Угадать за 4 хода можно если всегда стартовать из середины заданного диапазона и затем снова повторять данную операцию, пока не угадаешь.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int random = (int) Math.floor(Math.random() * 10);

        int number;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Угадайте число от 1 до 10");
            number = sc.nextInt();
            if (random == number) {
                System.out.println("Вы угадали число!");
            } else if (number > random) {
                System.out.println("Не верно, число меньше вашего.");
            } else if (number < random) {
                System.out.println("Не верно, число больше вашего.");
            }
        } while (random != number);
    }
}