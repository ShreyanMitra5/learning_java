


class Thing{

    //final means it is a constant and you cannot reassign a value to it
    //if you build a final attribute that means you need to initialize it with a value when declaring it   
    public final static int LUCKY_NUMBER = 7;

    public String name; 
    //static attributes: each object does not get it's own copy, only one copy
    public static String description;

    public static int count = 0;

    public int id;

    public Thing(){
        id = count; 

        count++;
    }

    public void showName(){
        System.out.println("Object id: " + id + ", " + description + ": " + name);
        //non static methods have access to both class attributes/variables and it's own attributes
    }

    public static void showInfo(){
        System.out.println(description);
        //this won't work; System.out.println(name);
        //static methods cannot print/return or access object attributes, as it is part of the class
    }

}



public class stat {
    public static void main(String[] args) {

        Thing.description = "I am a thing";
        //System.out.println(Thing.description);
        Thing.showInfo();

        System.out.println("Before creating any objects: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects: " + Thing.count);

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        //accessing pi via math class, it's static
        System.out.println(Math.PI);

        //It is a constant value, hence you cannot change it
        //constant values are written in UPPERCASE 
        //Math.PI = 3

        System.out.println(Thing.LUCKY_NUMBER);
        
        
    }
}
