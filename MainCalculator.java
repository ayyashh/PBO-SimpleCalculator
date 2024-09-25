import java.util.*;

public class MainCalculator {
    
    private CalculatorFunctions functions;
    private Scanner scn;
    
    public MainCalculator() {
        functions = new CalculatorFunctions();
        scn = new Scanner(System.in);
        
        char answer;
        double result = 0;
        
        do {
            System.out.println("==================== CALCULATOR ====================");
            System.out.println("||  [+] Add                                       ||");
            System.out.println("||  [-] Subtract                                  ||");
            System.out.println("||  [*] Multiply                                  ||");
            System.out.println("||  [/] Divide                                    ||");
            System.out.print("Enter Operations ");
            char choice = scn.next().charAt(0);
            System.out.print('\u000C');
            
            System.out.print("Enter First Number: ");
            double num1 = scn.nextDouble();
            System.out.print("Enter Second Number: ");
            double num2 = scn.nextDouble();
            
          
            switch (choice) {
                case '+':
                    result = functions.add(num1, num2);
                    break;
                case '-':
                    result = functions.subtract(num1, num2);
                    break;
                case '*':
                    result = functions.multiply(num1, num2);
                    break;
                case '/':
                    result = functions.divide(num1, num2);
                    break;
                default:
                    System.out.println("Syntax Error!");
        
            }

            System.out.println("Result: " + result);
            System.out.println("Would you like to compute again? [Y/n]");
            answer = scn.next().charAt(0);
            System.out.print('\u000C'); // clear the screen
            
        } while (answer == 'Y' || answer == 'y');
        
        System.exit(0);
    }
    
    
}
