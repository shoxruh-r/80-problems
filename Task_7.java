import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            int sum_1 = sum(i);
            int sum_2 = sum(sum_1);

            if (sum_2 == i && sum_1 < sum_2) {
                System.out.printf("%d %d \n", sum_1, sum_2);
            }
        }
    }
    
    static int sum(int num) {
        int result = 0;

        for (int i = 1; i < num; i++)
            if (num % i == 0)
                result += i;

        return result;
    }
}
