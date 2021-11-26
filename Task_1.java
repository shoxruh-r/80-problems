import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (i == 1 || num < result)
                result = num;
        }

        System.out.println(result);
    }
}
