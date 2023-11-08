package Conditionals;
//Вычисление значения функции
//Требуется написать программу, вычисляющую значение какой-либо функции у = f(x).


public class Task3 {
    public static void main(String[] args) {
        System.out.println(func(5,4));
    }

    public static int func(int x, int y) {
        if (y>0){
             y = y-x;
        } else if (y==0) {
            y = y*x;
        } else if (y<0) {
            y = y/x;
        }
        return y;
    }
}