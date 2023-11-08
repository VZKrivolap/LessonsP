package Arrays;

//В массиве чисел найти два максимальных элемента.

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 1; i < 10; i++) {
            array[i] = i;
        }
        func(array);
    }

    public static void func (int[] array){
        int max1 = array[0];
        int max2 = array[0];
        for(int i = 0; i<array.length; i++){
            if (max1<array[i]){
                max1 = array[i];
            }
        }

        for(int i = 0; i<array.length; i++){
            if (max2<array[i] & max2 != max1){
                max2 = array[i];

            }
        }

        System.out.println("Набольшие числа = " + max1 + " и " + max2);
    }
}