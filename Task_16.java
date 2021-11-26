import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of numbers: ");
        int count = input.nextInt();

        int big, small, extrem;
        System.out.print("Enter a number 1: ");
        int num = input.nextInt();
        big = small = extrem = num;

        int i = 1;
        int extremId = i;
        while (i++ < count) {
            System.out.printf("Enter a number %d: ", i);
            num = input.nextInt();

            if (small >= num) {
                small = num;
                extrem = small;
                extremId = i;
            }

            if (big <= num) {
                big = num;
                extrem = big;
                extremId = i;
            }
        }

        System.out.printf("%d %d", extrem, extremId);
    }
}
