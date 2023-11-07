package ait.fibonacci.model;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci(8);
        int res=0;
        for (Integer f:fibonacci) {
            res+=f;
            System.out.println(f);
        }
        System.out.println("Res="+res);

    }
}
