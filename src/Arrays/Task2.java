package Arrays;

//Найти сумму положительных элементов массива.

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -5};
        sum(array);
    }

    public static void sum (int [] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]>0){
                sum = sum+array[i];
            }
        }
        System.out.println(sum);
    }
}
