package Arrays2;

//Вычислить сумму элементов каждого столбца матрицы (двумерного массива).

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < 1; j++) {
                sum += array[i][j];
            }
            System.out.println(sum);
        }
    }
}