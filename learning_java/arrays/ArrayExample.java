

public class ArrayExample {
    public static void main(String[] args) {
        // int value = 7; 
        int[] values;

        // Arrays are non-primitive data types, and they are essentially pointing to the object of a specific class
        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        //iterating through the array and printing each value
        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);

        //intiliazing an array at the same time we are declaring it
        //instead of allocating memory, we are directly initializing it with values
        int[] numbers = {5, 6, 7};
        for (int j = 0; j < numbers.length; j++){
            System.out.println(numbers[j]);
        }
        }
    }    
}