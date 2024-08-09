package learning_java.to_string;


class Frog {

    private int id;
    private String name;

    public Frog(int id, String name){
        this.id = id;
        this.name = name;
    }

    //The usage of the toString() method is to create a string representation of your object
    public String toString(){
        
        //this is the format string specifying how it should look
        return String.format("%4d: %s", id, name);

        


        /* 
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
        //Here you are concatenating a non-primitive datatype -int, and turning it into a new string and then making a new string with name
        //return id + ": " + name;
        */
    }
        

}


public class tos {
    public static void main(String[] args) {
        
        //Object class defines the basic state and behavior that all objects must have
        Object obj = new Object();
        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(5, "Roger");

        //All methods we see are inherited from the object class (object class is secretly the parent of the Frog class)
        System.out.println(frog1);
        System.out.println(frog2);
        //Without setting up the toString() method you will get a hashcode -> Unique identifier for all ojects in java
    }
}
