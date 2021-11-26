import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of numbers: ");
        int count = input.nextInt();

        int big, small, bigId, smallId;
        System.out.print("Enter a number 1: ");
        int num = input.nextInt();
        big = small = num;

        int i = 1;
        bigId = smallId = i;
        while (i++ < count) {
            System.out.printf("Enter a number %d: ", i);
            num = input.nextInt();

            if (small > num) {
                small = num;
                smallId = i;
            }

            if (big < num) {
                big = num;
                bigId = i;
            }
        }

        if (bigId < smallId)
            System.out.printf("%d %d", big, bigId);
        else
            System.out.printf("%d %d", small, smallId);
    }
}
