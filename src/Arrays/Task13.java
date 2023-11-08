package Arrays;

// В заданном массиве чисел найти (посчитать) количество положительных и количество отрицательных элементов.
//
//Например, задан массив целых чисел [10, -5, 3, 2, 0, -1, 8, 0, 10, 3]. В нем 6 положительных и 2 отрицательных элемента (нули ни к тем, ни к другим не относятся).

public class Task13 {
    public static void main(String[] args) {
        int[] array = {10, -5, 3, 2, 0, -1, 8, 0, 10, 3};
        func(array);
    }

    public static void func(int[] array){
        int countMax = 0;
        int countMin = 0;

        for(int i = 0; i<array.length; i++){
            if (array[i]>0){
                countMax++;
            }
        }

        for(int i = 0; i<array.length; i++){
            if (array[i]<0){
                countMin++;
            }
        }

        System.out.println("Количество положительных элементов = " + countMax);
        System.out.println("Количество отрицательных элементов = " + countMin);

    }
}
