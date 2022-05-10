package Tasks;
import java.util.Scanner;

public class Task_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input whole number : ");
        int number1 = scanner.nextInt();
        if(number1 % 2 == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
