import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for first number:
        System.out.println("First number");
        double num1 = scanner.nextDouble();
        // Ask for secound number:
        System.out.println("Secound number");
        double num2 = scanner.nextDouble();
        // Ask for the operation
        System.out.println("Operation to be done? (+, -, *, /)");
        char opt = scanner.next().charAt(0);

        double result;

        switch (opt) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operation!!!");

                return;
        }
        System.out.println("Result " + result);

    }
}
