package learning_java.public_private_protected.world;

public class Field {
    private Plant plant = new Plant();

    public Field() {

        //size is proteced and Field is in the same package as plant
        System.out.println(plant.size);
    }
 
}
