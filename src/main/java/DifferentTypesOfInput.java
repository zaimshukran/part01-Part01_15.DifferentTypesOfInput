
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String text = scan.nextLine();
        System.out.println("Give an integer: ");
        int value = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double: ");
        double valDouble = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean valBoolean = Boolean.parseBoolean(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + valDouble);
        System.out.println("You gave the boolean " + valBoolean);
    }
}
