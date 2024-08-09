package learning_java.public_private_protected;

import learning_java.public_private_protected.world.Plant;


/*
 * Private --- only within the same class
 * Public --- from anywhere
 * Protected --- same class, subclass, package
 * no modifier --- same package only
 */


 //You can have a lot of normal classes in this file, but only one public class, as it has to have the same name as the file
public class PPP {
    public static void main(String[] args) {
        Plant plant = new Plant();
        

        System.out.println(plant.name);
        System.out.println(plant.ID);

        //This won't work, type is private
        //System.out.println(plant.type)

        //size is protected and PPP is not in the same package as Plant
        //System.out.println(plant.type);

        //Won't work, PPP and plant are in different packages, height has package level visibility
        System.out.println(plant.height);
    }
    
}
