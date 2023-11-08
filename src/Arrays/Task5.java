package Arrays;

//Найти максимальный элемент численного массива.

public class Task5 {
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
        System.out.println("Набольшее число - " + max);
    }
}
