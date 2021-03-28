import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = Integer.parseInt(sc.next());
        }
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println(sum);
    }
}