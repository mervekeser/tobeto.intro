import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        System.out.println("Enter a word");
        String word2 = scan.nextLine();

        char[] wrd=word.toCharArray();
        char[] wrd2=word2.toCharArray();



        if (word.length()!=word2.length()) {
            System.out.println("Error");
            return;
        }

        Arrays.sort(wrd);
        Arrays.sort(wrd2);

        if (Arrays.equals(wrd, wrd2)) {
            System.out.println("These words are Anagram");
        }
        else {
            System.out.println("These words aren't Anagram");
        }
    }
}