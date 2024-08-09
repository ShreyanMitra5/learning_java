

public class st{
  
    public static void main(String[] args) {
        //strings are immutable
        String info = "";

        //every time we are appending this, we are building a new string which is inefficient
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";
        System.out.println(info);
        
        //More efficient
        StringBuilder sb = new StringBuilder("");
        
        //Here we are not building a new string every time, we are just modifying the contents of the existing string
        sb.append("My name is Sue."); 
        sb.append(" ");
        sb.append("I am a lion tamer.");
        System.out.println(sb.toString());

        //Shortcut

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.")
        .append(" ") 
        .append("I am a skydiver.");
        System.out.println(s.toString());

        /////Formatting///////////////////////////////////////////
        //println, will print the output on a next line, print will not do that
        System.out.println("Here is some text.\t That was a tab. \nThat was a new line.");
        System.out.println("More text.");

        //printf is for string formatting and you can embed special characters
        //%d is formatting an integer, the extra argument in the printf statement is the integer that is going to get replaced
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);

        for (int i = 0; i<20; i++){
            //if you want to replace strings instead, then you can use %s
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }

        //formating floating point values

        //between the % and the f, you can put a decimal value for how precise you want the float value to be.
        System.out.printf("Total Value: %.2f\n", 5.6874);
        System.out.printf("Total Value: %7.1f\n", 343.27364);
}
}