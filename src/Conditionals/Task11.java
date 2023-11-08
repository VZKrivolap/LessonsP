package Conditionals;
//Теперь ты загадываешь число компьютеру, а его задача угадать твое число. Каждый ход компьютер спрашивает больше/меньше ли
// его число чем угаданное, тем самым он должен придти к твоему числу.
// Дополнительно: для диапазона чисел от 1 до 10 он должен угадать за 4-5 ходов. Для диапазона чисел от 1 до 100 за 8-10 ходов. Смотри что такое бинарный поиск

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int compNumber = (int) Math.round(Math.random() * max);
        func(min, max, compNumber);
    }

    public static void func(int min, int max, int compNumber) {
        System.out.println("Твое число " + compNumber + " ? (1-ДА,0-НЕТ)");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while (i != 1) {
            System.out.println("Твоё число больше " + compNumber + "? (1-ДА,0-НЕТ)");
            i = scanner.nextInt();
            if (i == 1) {
                min = compNumber + 1;
                int compNumber2 = min + (int) (Math.random() * ((max - min) + 1));
                compNumber = compNumber2;
                System.out.println("Ты загал число " + compNumber + " ? (1-ДА,0-НЕТ)");
                i = scanner.nextInt();
            } else {
                max = compNumber - 1;
                int random2 = min + (int) (Math.random() * ((max - min) + 1));
                compNumber = random2;
                System.out.println("Ты загал число " + compNumber + " ? (1-ДА,0-НЕТ)");
                i = scanner.nextInt();
            }
        }
        System.out.println("Твоё число - " + compNumber);
    }
}