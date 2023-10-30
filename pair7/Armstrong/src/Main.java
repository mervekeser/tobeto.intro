import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int temp = number;
        int index = 0;

        int[] digits = new int[String.valueOf(number).length()];

        while (number > 0) {
            int digit = number % 10;
            digits[index] = digit;
            number /= 10;
            index++;
        }


        for (int i : digits) {
            total += (Math.pow(i, digits.length));
        }

        if (total == temp) {
            System.out.println("This is an Armstrong number: " + temp + " = " + total);

        } else {
            System.out.println("This number isn't an Armstrong number: " + temp + " != " + total);
        }
    }
}