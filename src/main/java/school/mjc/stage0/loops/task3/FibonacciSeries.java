package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        for(int i = 0; i<lastFibonacci; i++){
            System.out.println(a);
            int c = a;
            a = a+b;
            b = c;
        }
    }
}
