package learning_java.inheritance;

public class Machine {
    //If you declare it private it is only accessible within this class, you cannot use it in any other class
    //private String name = "Machine Type 1";

    //protected means you can access it anywhere within the package and also in the child class
    //Public means you can use it in any class even if it is not a child class
    protected String name = "Machine Type 1";

    public void start(){
        System.out.println("Machine Started.");
    }
    public void stop(){
        System.out.println("Machine Stopped.");
    }
    
    
}
