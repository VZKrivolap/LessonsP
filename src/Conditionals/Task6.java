package Conditionals;
// Принадлежит ли точка кругу с центром в начале координат
//С клавиатуры задаются координаты точки, а также радиус круга, центр которого находится в начале координат.
// Определить, принадлежит ли данная точка кругу.

// Даны точки координат х и у, а также радиус круга р. Необходимо проверить больше ли какая либо из точек координат, чем р.
//

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите точку x");
        int x = sc.nextInt();
        System.out.println("Введите точку y");
        int y = sc.nextInt();
        System.out.println("Введите радиус");
        int r = sc.nextInt();
        func(x, y, r);
    }

    public static void func(int x, int y, int r) {
        if (x<=r & y<=r){
            System.out.println("Точка находится внутри круга");
        }
        else {
            System.out.println("Точка не находится внутри круга");
        }
    }

}