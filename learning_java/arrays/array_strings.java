public class array_strings {
    public static void main(String[] args) {
        //Allocating enough memory for 3 references to strings
        String[] words = new String[3];

        //Allocating memory for the 3 acutal strings itself
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";
        
        System.out.println(words[2]);

        //All in one step:
        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        //Instead of indexing I am doing (for fruit in fruites) -> Python Code
        for (String fruit: fruits){
            System.out.println(fruit);
        }

        //This value is allocating enough memory for the value of it (0), and this is non-primitive datatype
        int value = 0;

        //This is allocating enough memory for reference to a string(adress of some memory) (not the acutal value of the string)
        //This is because we will never know how large the string really is
        String text = null;
        //null means nothing
        System.out.println(text);
        
        //This array is actually references to strings
        //This thing below is only allocating enough memory for 2 references to Strings; it's not allocating memory for the strings
        String[] texts =  new String[2];
        //By default Java will intialize each of those values as null
        System.out.println(texts[0]);

        //Here we are allocating memory for a string, we are pointing this reference here at a string
        texts[0] = "one";

    }
}
