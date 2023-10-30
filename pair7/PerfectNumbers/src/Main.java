public class Main {
    public static void main(String[] args) {
        long count = 2;

        for (int i = 0; i < 10; ) {
            if (isPNumber(count)) {
                System.out.println(count);
                i++;
            }
            count++;
            if (count == 80000) {
                System.out.println(count);
            }
        }
    }

    public static boolean isPNumber(long number) {
        long total = 0;

        for (long dividing = 1; dividing < number; dividing++) {
            if (number % dividing == 0) {
                total += dividing;
            }
        }
        return total == number;
    }
}
