package Arrays;

//Найти сумму и произведение элементов одномерного числового массива.


import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] array = new int[10];
        for(int i = 1; i < 10; i++) {
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));
        int sum = 0;
        int multipl = 1;

        for (int i = 0; i<array.length; i++){
            sum = sum+array[i];
        }
        System.out.println(sum);

        array [0] = 1;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i<array.length; i++){
            multipl = multipl*array[i];
        }
        System.out.println(multipl);
    }
}
