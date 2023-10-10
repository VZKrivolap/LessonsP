package Conditionals;
//Вычисление площадей геометрических фигур
//Написать программу, которая в зависимости от выбора пользователя вычисляет площадь одной из трех геометрических
//фигур: прямоугольника, треугольника или круга.

// Площадь прямоугольника S = a · b
// Площадь треугольника S =	1/2a · h
// Площадь круга S = π*r^2
// Я предполагаю, что необходимо путем ввода пользователем варианта программа должна направляться по одной из ветви выполнения.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Площадь для какой фигуры необходимо вычислить? 1 - прямоугольник. 2 - треугольник. 3 - круг");
        int f = sc.nextInt();

        if (f == 1){
            System.out.println("Введите длину стороны а");
            int a = sc.nextInt();
            System.out.println("Введите длину стороны b");
            int b = sc.nextInt();
            int s=a*b;
            System.out.println("Площадь прямоугольника равна " + s);
        } else if(f==2){
            System.out.println("Введите длину стороны А");
            int a = sc.nextInt();
            System.out.println("Введине длину проведенной к этой стороне высоты");
            int h = sc.nextInt();
            int s=a/2*h;
            System.out.println("Площадь треугольника равна " + s);
        } else if(f==3){
            System.out.println("Введите длину радиуса");
            int r = sc.nextInt();
            int s= (int) (3.14*(r*r));
            System.out.println("Площадь треугольника равна " + s);
        } else {
            System.out.println("Введено некорректное значение");
        }
    }
}
