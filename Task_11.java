import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter a second number: ");
        int secondNumber = input.nextInt();
        int result = 0;

        while (firstNumber >= secondNumber) {
            firstNumber -= secondNumber;
            result++;
        }

        System.out.printf("%d %d", firstNumber, result);
    }
}
