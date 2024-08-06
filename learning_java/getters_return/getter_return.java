
package learning_java.getters_return;

class Person{
    String name;
    int age;

    //void does not return any value
    void speak(){
        System.out.println("My name is: " + name);
    }

    //int method returns an int value
    int calcluateyearsToRetirement(){
        int yearsLeft = 65 - age;

        //System.out.println(yearsLeft);
        return yearsLeft;
    }

    int getAge(){
        return age;
    }
    //returns a string value
    String getName(){
        return name;
    }
}

public class getter_return {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "Joe";
        person1.age = 25;

        person1.speak();

        int years = person1.calcluateyearsToRetirement();
        System.out.println("Years till retirement " + years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        
        
    }
}
