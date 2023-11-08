package Arrays;

// В однородном массиве, состоящем из N вещественных элементов, найти максимальный по модулю элемент массива.

public class Task6 {
    public static void main(String[] args) {
        int[] array = {-10, 5, -3, 15, -25};
        fucn(array);
    }
    
    public static void fucn(int[] array){
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            array [i] = Math.abs(array[i]);
            if (max<array[i]){
                max = array[i];
            }
        }

        System.out.println("Набольшее число - " + max);
    }
}
