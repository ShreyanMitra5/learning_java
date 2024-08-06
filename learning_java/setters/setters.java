package learning_java.setters;

class Frog{
    //private means I cannot access this data from outside the class
    //But inside the class I can access it...
    private String name; 
    private int age;

    //setting up the name instead of doing frog1.name, where you need to know the internals of the class
    public void setName(String name){
        //name = newName;

        //this.name is the instance variable, the value that belongs to the class
        //name by itself is the argumental parameter or the local variable
        //when we use 'name' raw, it assigns itself to the closest declared value
        this.name = name;
    }

    public void setAge(int age){
        //age = newAge;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }
}



public class setters {
    public static void main(String[] args) {
       Frog frog1 = new Frog();
       
       //Here we are setting an instance variable with the = sign
       //frog1.name = "Bertie";
       //frog1.age = 1;

       //Here we are calling the method to set a name
       frog1.setName("Bertie");
       frog1.setAge(1);
       
       System.out.println(frog1.getName());
    }
}
