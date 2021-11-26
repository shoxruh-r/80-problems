import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        for (int i = 2; i <= num; i++)
            if (isPrime(i))
                System.out.println(i);
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }
}
