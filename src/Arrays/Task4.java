package Arrays;

//Найти номер и значение первого положительного элемента массива.

public class Task4 {
    public static void main(String[] args) {
        int[] array = {-2, -3, -4, 5, 7, 9};
        func(array);
    }

    public static void func(int[] array){
        for (int i = 0; i<array.length;i++){
            if (array[i]>0) {
                System.out.println("Индекс = " + i + ". Значение = " + array[i]);
                break;
            }
        }
    }
}
