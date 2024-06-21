package programmation_logic;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 25; //Test...
        for(int i = 0; i< n+1; i++ ){
            System.out.print(Fibonacci.fibonacciRecursion(i)+", ");
        }
    }

    static int fibonacciRecursion(int n) {
        if (n < 2) return n;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }


}
