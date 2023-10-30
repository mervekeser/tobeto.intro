import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumb = scan.nextInt();
        System.out.println("Enter second number: ");
        int secondNumb = scan.nextInt();

        int sum1 = amicable(firstNumb);
        int sum2 = amicable(secondNumb);

        if (sum1 == sum2) {
            System.out.println(firstNumb + " and " + secondNumb + " are Amicable Pairs");
        } else {

            System.out.println(firstNumb + " and " + secondNumb + " aren't Amicable Pairs");

        }


    }

    public static int amicable(int numb) {
        int sum1 = 0;
        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0) {
                sum1 += i;
            }
        }

        return sum1;
    }
}