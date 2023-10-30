public class Main {
    public static void main(String[] args) {
        int number=100;
        long fib1=0;
        long fib2=1;
        long total;

        for(int i =1;i<=100;i++) {
            System.out.print(fib1+" ");
            total=fib1+fib2;
            fib1=fib2;
            fib2=total;

        }
    }
}