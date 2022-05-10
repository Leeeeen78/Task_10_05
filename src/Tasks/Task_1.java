package Tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1 :");
        int number1 = scanner.nextInt();
        System.out.println("Input number 2 :");
        int number2 = scanner.nextInt();
        System.out.println("Is number1 equal to number2? " + (number1==number2));
        System.out.println("Is number1 less than number2? " + (number1 < number2));
        System.out.println("Is number1 less or equal to number2? " + (number1 <= number2));
        System.out.println("Is number1 greater than number2? " + (number1 > number2));
        System.out.println("Is number1 greater or equal number2? " + (number1 >= number2));
    }

}

