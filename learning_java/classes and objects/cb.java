

//template for creating objects
//You can make objects that will reperesent a particular person, but this class person, 
//represents the idea of a person in general
class Person{
    //Instance variables (data or "state")
    String name;
    int age;

    //Classes can contain

    //1. Data
    //2. Subroutines (methods)

    //Behavior is modelled using subroutines; a subroutine that is part of a class is called a method
    void speak(){
        for (int i = 0; i<3; i++){

        System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }

    void sayHello(){
        System.out.println("Hello there");
    }
}


public class cb {
    public static void main(String[] args) {
        //from here I can build particular people with different instance variables, and each of them are an object
        Person person1 = new Person(); //new Person(), means I am initializing a new Person object
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.speak();
        person1.sayHello();
        
        Person person2 = new Person();
        person2.name = "Sarah Smiths";
        person2.age = 20;
        person2.speak();
        person1.sayHello();
        //If we don't invoke/call the function, then there will be no output
    }    
}
