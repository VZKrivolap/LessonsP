package Arrays;

//В массиве найти минимальный и максимальный элементы, поменять их местами.

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 1; i < 10; i++) {
            array[i] = i;
        }
        func(array);
    }

    public static void func(int[] array){
        int maxIndex = 0;
        int minIndex = 0;

        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if (max<array[i]){
                max = array[i];
                 maxIndex = i;
            }
        }

        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if (min>array[i]){
                min = array[i];
                minIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println(Arrays.toString(array));
    }
}
