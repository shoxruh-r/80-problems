import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x: ");
        double x = input.nextDouble();
        System.out.print("y: ");
        double y = input.nextDouble();

        double z;

        if (x < y) {
            z = x;
            x = (x + y) / 2;
            y = (z * y) * 2;
        } else if (x > y) {
            z = y;
            y = (x + y) / 2;
            x = (x * z) * 2;
        }

        System.out.println(x + " " + y);
    }
}
