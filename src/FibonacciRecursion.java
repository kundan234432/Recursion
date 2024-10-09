public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibanacci(6));
    }

    private static int fibanacci(int n) {

        if(n <2 ){

            return n;
        }

        return  fibanacci(n-1)+ fibanacci(n-2);
    }
}
