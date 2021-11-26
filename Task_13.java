import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of numbers: ");
        int count = input.nextInt();

        System.out.print("Enter a number 1: ");
        int num = input.nextInt();
        int small = num;

        int i = 1;
        int id = i;
        while (i++ < count) {
            System.out.printf("Enter a number %d: ", i);
            num = input.nextInt();

            if (small > num) {
                small = num;
                id = i;
            }
        }

        System.out.printf("%d %d", small, id);
    }
}
