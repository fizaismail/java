import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class fiza2{
    public static void main(String[] args) {
        // Variables and Data Types
        int integerVariable = 5;
        double doubleVariable = 10.5;
        String stringVariable = "Hello, ";

        // Control Structures - If statement
        if (integerVariable > 0) {
            System.out.println(stringVariable + "positive number");
        } else if (integerVariable < 0) {
            System.out.println(stringVariable + "negative number");
        } else {
            System.out.println(stringVariable + "zero");
          
        }

        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Input/Output - Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        // Functions
        int sum = addNumbers(3, 7);
        System.out.println("Sum of numbers: " + sum);

        // Exception Handling - try-catch block
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // File Handling
        File file = new File("holyquran.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("This book is always precious.");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }

    // Function with parameters and return type
    private static int addNumbers(int a, int b) {
        return a + b;
    }

    // Function with exception handling
    private static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }
}