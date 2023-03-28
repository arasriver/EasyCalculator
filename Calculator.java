import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /, log, sqrt, pow): ");
        String operator = scanner.next();

        double result = 0.0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;

            case "log":
                result = Math.log(num1);
                break;

            case "sqrt":
                result = Math.sqrt(num1);
                break;

            case "pow":
                result = Math.pow(num1, num2);
                break;

            default:
                System.out.println("Invalid operator entered.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
