package Arrays;

//Какая сумма элементов массива больше: с первого до элемента с номером К или от элемента с номером К+1 до последнего?

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        int [] array = new int[10];
        for(int i = 1; i < 10; i++) {
            array[i] = i;
        }
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int index = array[k];

        for (int i = 0; i<=index; i++){
                sum1 = sum1+array[i];
        }

        for (int i = k; i<(array.length-1); i++){
                sum2 = sum2+array[i];
        }

        if (sum1>sum2){
            System.out.println("Сумма элементов от первого до элемента k больше");
        } else if (sum2>sum1) {
            System.out.println("Сумма элементов от элемента k до последнего больше");
        } else {
            System.out.println("Суммы элементов равны");
        }
    }
}
