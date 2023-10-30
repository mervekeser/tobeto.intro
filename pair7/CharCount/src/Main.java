import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scan.nextLine();

        HashMap<Character, Integer> numberOfRepetitions = new HashMap<>();


        for (char character : text.toCharArray()) {
            if (numberOfRepetitions.containsKey(character)) {
                numberOfRepetitions.put(character, numberOfRepetitions.get(character) + 1);
            } else {
                numberOfRepetitions.put(character, 1);
            }
        }

        for (char i : numberOfRepetitions.keySet()) {
            if (numberOfRepetitions.get(i) > 0) {
                System.out.println("Number of Repetitions: " + i + " => " + numberOfRepetitions.get(i));
            }
        }
    }
}