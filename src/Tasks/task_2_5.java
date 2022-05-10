package Tasks;
import java.util.Scanner;

public class task_2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input boolean value : ");
        boolean b = scanner.nextBoolean();
        System.out.println("The opposite value of your entered is " + !b);

    }
}
