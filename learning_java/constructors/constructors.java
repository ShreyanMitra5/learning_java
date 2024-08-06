package learning_java.constructors;


class Machine{
    private String name;
    private int code;

    //constructor doesn't have a return type, and the name of your constructor is always equal to the name of your class
    public Machine(){
        //Needs to be first line

        //this line calls the 3rd constructor, which then prints (third constructor is running), and then it comes back to this constructor
        //try debuging and see how it works
        this("Arnie", 0);
        System.out.println("Constructor Running!");

        //All objects will have their name set to Arnie initially
        //name = "Arnie";
    }

    public Machine(String name){
        this(name, 0);
        System.out.println("Second Constructor Running");
        this.name = name;
    }

    public Machine(String name, int code){
        System.out.println("Third Constructor Running");
        this.name = name;
        this.code = code;
    }
}

public class constructors {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        //Machine machine2 = new Machine("Bertie");

        //Machine machine3 = new Machine("Chalky", 7);

        //invoking the constructor
        //new Machine();
    }
}
