package learning_java.public_private_protected.world;

public class Plant {
    //you can access name anywhere
    //bad practice, shouldn't declare instances public
    public String name;

    //acceptable practice --- it's final.
    public final static int ID = 8;

    //You can only access it within this class
    private String type;

    //Cannot be accessed in a random class, but it can be accessed in a child/sub class, within this class, and within the same package
    protected String size;

    //You can access it all throughout within your package
    int height;

    public Plant(){
        
        this.name = "Freddy";

        this.type = "plant";

        this.size = "medium";

        this.height = 8;
    }
}
