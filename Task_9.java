import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int room = 0;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
            room++;
        }

        System.out.printf("%d %d", room, sum);
    }
}
