import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[][] matrix = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ".";
            }
        }

        for (int i = 0, j = 0; i < n; i++, j++) {
            matrix[i][j] = "*";
        }

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            matrix[i][j] = "*";
        }

        for (int i = 0, j = n / 2; i < n; i++) {
            matrix[i][j] = "*";
        }

        for (int i = n / 2, j = 0; j < n; j++) {
            matrix[i][j] = "*";
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}