import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}