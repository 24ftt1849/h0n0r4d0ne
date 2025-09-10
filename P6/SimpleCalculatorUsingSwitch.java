package P6;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an arithmetic expression: ");
        int num1 = scanner.nextInt();
        String expression = scanner.next(); //used for one character input
        int num2 = scanner.nextInt();
        Boolean valid = false;
        String calculation = null;
        int result = 0;


        switch (expression) {
            case "+":
            result = num1 + num2; valid = true; calculation = "sum";
            break;

            case "-":
            result = num1 - num2; valid = true; calculation = "division";
                break;

            case "*":
            result = num1 * num2; valid = true; calculation = "multiplication";
                break;
            
            case "/":
            if (num2 == 0){
                System.out.println("Math error: The divisor cannot be Zero");
            }
            else{
                result = num1 / num2; valid = true; calculation = "division";
            }
                break;

            default:
        System.out.println("Invalid operation");
            break;
        }
        if (valid){
            System.out.println("The " + calculation + " is " + result);
        }

        scanner.close();
    }
}
