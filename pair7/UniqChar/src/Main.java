public class Main {
    public static void main(String[] args) {
        String word = "seeelin";

        if (isUniq(word)) {
            System.out.println("This word has unique characters");
        } else {
            System.out.println("This word doesn't have unique characters");
        }
    }

    public static boolean isUniq(String text) {

        for (int i = 0; i < text.length() - 1; i++) {
            char character = text.charAt(i);
            for (int j = i + 1; j < text.length(); j++) {
                if (character == text.charAt(j)) {
                    return false;
                }
            }
        }
        return (true);

    }
}