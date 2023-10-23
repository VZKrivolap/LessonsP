package Arrays;

//Найти сумму положительных элементов массива.

public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        int [] array = {1, -2, 3, -4, 5, -5};
        for (int i = 0; i<array.length; i++){
            if (array[i]>0){
                sum = sum+array[i];
            }
        }
        System.out.println(sum);
    }
}
