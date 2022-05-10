package Tasks;
import java.util.Scanner;

public class Task_2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input whole number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Please, input whole number2: ");
        int number2 = scanner.nextInt();
        if (number1 == number2 || (number1 < 0 && number2 > 0) || (number1 > 100 && number2 > 100)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
