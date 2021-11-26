import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of numbers: ");
        int count = input.nextInt();

        int big, small;
        System.out.print("Enter a number 1: ");
        int num = input.nextInt();
        big = small = num;

        int i = 1;
        while (i < count) {
            System.out.printf("Enter a number %d: ", i + 1);
            num = input.nextInt();

            big = Math.max(big, num);
            small = Math.min(small, num);

            i++;
        }

        System.out.printf("%d %d", small, big);
    }
}
