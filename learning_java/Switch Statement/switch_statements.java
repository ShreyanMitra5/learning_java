import java.util.Scanner;

public class switch_statements{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        //text value can either be int or string
        switch(text){
        case "start":
            System.out.println("Machine Started!");
            break;
        case "stop":
            System.out.println("Machine Stopped.");
            break;
        //Default Command for any other testcase    
        default:
            System.out.println("Command not recognized");
        }
    }    
}
