package learning_java.inheritance;

//This means Car is a child class of Machine or Machine is a parent of car
//Car inherits from machine

//This means Car has now got all the methods that Machine has or inherits all the methods from Machine
public class Car extends Machine{

    //overriding the start() method from the Machine class
    //@Override is an annotation and a class
    @Override
    public void start(){
        System.out.println("Car Started");
    }

    public void wipeWindShield(){
        System.out.println("Wiping wind shield");
    }

    public void showInfo(){
        System.out.println("Car name: " + name);
    }
}
