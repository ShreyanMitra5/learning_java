public class Variables{

    public static void main(String[] args){
        int myNumber;
        myNumber = 88;
        //This also works: int myNumber == 88;
        //32 bit values

        short myShort = 847;
        //16 bit values

        long myLong = 9797;
        //Longer numbers, 64 bit values

        double myDouble = 7.23459;
        //Floating point numbers, very precise
        //float myDouble = 7.23459, also works

        float myFloat = 324.3f;
        //Shorter floating point number, you need to put the f behind it

        char myChar = 'y';
        //A single character, and you need to put single quotes ('')...60 bits

        boolean myBool = true;
        //Holds a boolean value true or false, first letter needs to be lower-case

        byte myByte = 127;
        //Holds 8 bits of data; you can express it in any way you want
        

        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBool);
        System.out.println(myByte);
   }
}