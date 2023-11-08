package Arrays;

// В одномерном массиве найти количество положительных элементов.

public class Task12 {
    public static void main(String[] args) {
        int[] array = {-5, 2, 3, -10, 15, -20};
        func(array);
    }

    public static void func(int [] array){
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if (array[i]>0){
                count++;
            }
        }

        System.out.println(count);
    }
}
