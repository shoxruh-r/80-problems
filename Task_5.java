import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++)
            if (isPerfect(i))
                System.out.println(i);
    }

    static boolean isPerfect(int num) {
        int result = 0;

        for (int i = 1; i < num; i++)
            if (num % i == 0)
                result += i;

        return num == result;
    }
}
