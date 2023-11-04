package Arrays2;

// В двумерном массиве (матрице) найти строку, сумма элементов которой является максимальной среди всех строк матрицы.

public class Task4 {
    public static void main(String[] args) {
        int [][] array = {{3, 4, 10, 12, 15}, {5, 8, 10, 29, 35}};
        int sumMax = 0;
        int rowMax = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum+= array[i][j];
            }
            if (sum>sumMax){
                sumMax=sum;
                rowMax=i;
            }
        }

        System.out.println("Номер строки равен " + rowMax);
    }
}
