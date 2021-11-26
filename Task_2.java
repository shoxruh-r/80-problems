import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        int days = 365;

        if (isLeapYear)
            days = 366;

        System.out.println(days);
    }
}
