package Conditionals;
//Вычисление значения функции
//Требуется написать программу, вычисляющую значение какой-либо функции у = f(x).

// Буду честен, тут мне пришлось подглядеть решение на Паскале, потому что я понимаю, что функция это зависимость
// одного числа от другого, но не понимаю, как именно она должна выражаться.

public class Task3 {
    public static void main(String[] args) {
        int x = 2;
        int y = -4;

        if (y>0){
            y = y-x;
            System.out.println(y);
        } else if (y==0) {
            y = y*x;
            System.out.println(y);
        }
    else if (y<0) {
        y = y/x;
        System.out.println(y);
    }
    }
}
