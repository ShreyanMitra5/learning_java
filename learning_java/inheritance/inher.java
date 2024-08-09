package learning_java.inheritance;

public class inher {
    public static void main(String[] args) {
        Machine mach1 = new Machine();

        mach1.start();
        mach1.stop();

        Car car1 = new Car();
        //All methods we can see when we do car1., are all inherited from the ultimate ancestor. 

        car1.start();
        car1.wipeWindShield();
        car1.showInfo();
        car1.stop();
    }
}
