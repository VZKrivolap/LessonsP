package Arrays2;

//Найти сумму элементов каждой строки матрицы (двумерного массива).

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j;
            }
        }

        for (int i = 0; i<array.length; i++){
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
                }
            System.out.println(sum);
        }
    }
}
