import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int proba = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                System.out.print("true");
                break;
            }
            if (proba == 0) {
                if (test > num) {
                    proba = 1;
                } else if (num > test) {
                    proba = 2;
                } else {
                    test = num;
                }
            } else {
                if (test > num && proba == 2) {
                    System.out.println("false");
                    break;
                } else if (test < num && proba == 1) {
                    System.out.println("false");
                    break;
                } else {
                    test = num;
                }
            }
        }
    }
}