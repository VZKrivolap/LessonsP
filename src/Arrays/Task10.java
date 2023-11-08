package Arrays;

//В одномерном массиве найти минимальный и максимальный элементы. Вычислить их разность.

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 1; i < 10; i++) {
            array[i] = i;
        }
        func(array);
    }

    public static void func(int[] array){
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if (max<array[i]){
                max = array[i];
            }
        }

        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if (min>array[i]){
                min = array[i];
            }
        }

        System.out.println("Разница между числами = " + (max-min));
    }
}
