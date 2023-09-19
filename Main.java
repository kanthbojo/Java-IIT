import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Initialise scanner object to take input
        Scanner input = new Scanner(System.in);

        // Initialize sum to 0
        int sum = 0;

        // Check if next token is of int data-type or int  value is available in input stream
        while (input.hasNextInt()) {
            // Read int value
            int number = input.nextInt();
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
