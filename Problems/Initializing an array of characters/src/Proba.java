import java.util.Arrays;

public class Proba {
    public static void main(String[] args) {
        int[] numbers1 = { 1, 2, 3, 4 };
        int[] numbers2 = { 1, 2, 3, 4 };
        int[] numbers3 = { 4, 3, 2, 1 };
        int[] numbers4 = { 1, 2, 3 };

        System.out.println(Arrays.equals(numbers3, numbers1));
        System.out.println(Arrays.equals(numbers1, numbers1));
        System.out.println(Arrays.equals(numbers1, numbers2));
        System.out.println(Arrays.equals(numbers2, numbers3));
        System.out.println(Arrays.equals(numbers1, numbers4));
    }
}
