package learning_java.public_private_protected.world;

public class Oak extends Plant {
    public Oak(){
        
       // Won't work, type is private
       // type = "tree";

       //This works --- size is protected and oak is a subclass of plant
       this.size = "large";

       //no access specifier, works because oak and plant are in the same package
       this.height = 10;
    }
}
