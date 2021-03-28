import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print(a[size - 1]);
        for (int i = 0; i < size - 1; i++) {
            System.out.print(" " + a[i]);

        }
    }
}