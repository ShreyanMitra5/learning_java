package learning_java.interfaces_1;

public class Machine implements Info{
    private int id = 7;

    public void start(){
        System.out.println("Machine Started");
    }

    public void showInfo(){
        System.out.println("Machine id is: " + id);
    }
}
