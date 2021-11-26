import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of numbers: ");
        int count = input.nextInt();

        int small;
        System.out.print("Enter a number 1: ");
        int num = input.nextInt();
        small = num;

        int i = 1;
        while (i++ < count) {
            System.out.printf("Enter a number %d: ", i);
            num = input.nextInt();

            if (num > 0 && num < small) {
                small = num;
            }
        }

        System.out.println(Math.max(small, 0));
    }
}
