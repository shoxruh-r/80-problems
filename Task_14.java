import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of numbers: ");
        int count = input.nextInt();

        int big, small, firstSmallId, lastBigId;
        System.out.print("Enter a number 1: ");
        int num = input.nextInt();
        big = small = num;

        int i = 1;
        firstSmallId = lastBigId = i;
        while (i++ < count) {
            System.out.printf("Enter a number %d: ", i);
            num = input.nextInt();

            if (small > num) {
                small = num;
                firstSmallId = i;
            }

            if (big <= num) {
                big = num;
                lastBigId = i;
            }
        }

        System.out.printf("%d %d; %d %d", small, firstSmallId, big, lastBigId);
    }
}
