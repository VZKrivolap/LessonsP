package Arrays;

// Дан массив, содержащий положительные и отрицательные числа. Заменить все элементы массива на противоположные по знаку.
//
//Например, задан массив [1, -5, 0, 3, -4]. После преобразования должно получиться [-1, 5, 0, -3, 4].

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {1, -5, 0, 3, -4};
        func(array);
    }
    
    public static void func (int [] array){
        for (int i = 0; i<array.length; i++){
            array [i] = array[i] * (-1);
        }
        System.out.println(Arrays.toString(array));
    }
}
