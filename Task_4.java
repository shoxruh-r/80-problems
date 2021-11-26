import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Day: ");
        int day = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();
        int lastDay;

        switch (month) {
            case 2:
                lastDay = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDay = 31;
                break;
            default:
                System.out.println("Bunday oy yo'q");
                return;
        }

        if (day == lastDay && month == 12) {
            day = 1;
            month = 1;
        } else if (day == lastDay) {
            month++;
            day = 1;
        } else if (day < lastDay) {
            day++;
        } else {
            System.out.println("Bunday sana yo'q");
            return;
        }

        String printDay = "" + day;
        String printMonth = "" + month;

        if (day < 9)
            printDay = "0" + printDay;

        if (month < 9)
            printMonth = "0" + printMonth;

        System.out.println(printDay + "." + printMonth);
    }
}
