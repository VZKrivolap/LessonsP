package Arrays;

// Все элементы массива поделить на значение наибольшего элемента этого массива.

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int [] array = {327, 381, 891, 918, 212, 848, 770, 363, 416, 736};

        int max = array[0];
        for(int i = 0; i<array.length; i++){
            array [i] = Math.abs(array[i]);
            if (max<array[i]){
                max = array[i];
            }
        }

        for (int i = 0; i<array.length; i++){
            double a = (double) array[i]/max;
            System.out.println(a);
        }

    }
}
