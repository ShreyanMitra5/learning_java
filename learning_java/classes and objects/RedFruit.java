import java.util.Scanner;

class Vehicle{
    //Instance Variables/Data
    String type;
    int horsepower;
    int wheels;
    int year;


}


public class RedFruit {
    public static void main(String[] args) {
        

        Vehicle vehicle1 = new Vehicle();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a type of vehicle: ");
        vehicle1.type = input.nextLine();

        System.out.println(vehicle1.type);

        vehicle1.horsepower = 565;
        vehicle1.wheels = 4;
        vehicle1.year = 2020;
        System.out.println(vehicle1.horsepower);


    }
}

