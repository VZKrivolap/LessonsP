package Conditionals;
//Найти сумму цифр любого 5ти значного числа, если сумма четное число - разделить ее на 2.
//Иначе умножить на 2

public class Task9 {
    public static void main(String[] args) {
        int x = 12345;
        int sum = 0;
        int current;
        int result;

        current = x%10;
        sum+=current;
        x = x/10;
        current = x%10;
        sum+=current;
        x = x/10;
        current = x%10;
        sum+=current;
        x = x/10;
        current = x%10;
        sum+=current;
        x = x/10;
        current = x%10;
        sum+=current;

        if (sum%2==0){
            result = sum/2;
            System.out.println(result);
        } else {
            result = sum*2;
            System.out.println(result);
        }
    }
}
