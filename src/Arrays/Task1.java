package Arrays;

//Найти сумму и произведение элементов одномерного числового массива.


import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 1; i < 10; i++) {
            array[i] = i;
        }

        sum(array);
        multipl(array);
    }

    public static void sum(int [] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum = sum+array[i];
        }
        System.out.println(sum);
    }

    public static void multipl(int [] array){
        int multipl = 1;
        for (int i = 0; i<array.length; i++){
            multipl = multipl*array[i];
        }
        System.out.println(multipl);
    }


}