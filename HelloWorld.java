public class HelloWorld {
    public static void main(String[] args) {
        printHelloWorld();
    }
    
    public static void printHelloWorld() {
        int x = factorial(5);
        System.out.println("Hello, World!");
        System.out.println(x);
    }
    public static int factorial(int N) {
        if (N>1){
            return N * factorial(N - 1);
        } 
        else {
            return N;
        }
    }
}