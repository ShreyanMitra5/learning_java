
class Result {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
    public static void main(String[] args) {
        System.out.println(utopianTree(7));
    }

    public static int utopianTree(int n) {
    // Write your code here
    int height = 0;
       for (int i = 0; i <= n; ++i ){
           if (i % 2 == 0){
               height++;
           }
           else{
               height *= 2;
           }
       }
       return(height);
    }

}
