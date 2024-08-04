import java.util.Scanner;
// We imported the class scanner

public class user_input3 {
    public static void main(String[] args) {
        
        //Create scanner object
        Scanner input = new Scanner(System.in);
        //You can call input anything you would like

        //Output the prompt
        System.out.println("Enter a floating point value: ");

        //Wait for the user to enter a line of text
        Double value = input.nextDouble();

        //Tell them what they have entered
        System.out.println("You entered: " + value);
    }
}
