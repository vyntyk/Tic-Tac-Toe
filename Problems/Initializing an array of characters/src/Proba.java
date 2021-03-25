import java.util.Arrays;

public class Proba {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (char letter = 'a'; letter <= 'f'; letter++) {
                if (letter < 'f') {
                    continue;
                }
                System.out.println(letter);
            }
        }
    }
}
