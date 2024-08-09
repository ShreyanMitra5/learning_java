package learning_java.public_private_protected;
import learning_java.public_private_protected.world.Plant;
import world.Plants;

public class Grass extends Plant{
    public Grass() {

        // Won't work --- Grass is not in the same package as plant even though it's a subclass
        // System.out.println(plant.height);
    }
}
