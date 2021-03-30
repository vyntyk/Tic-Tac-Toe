import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        char op = sc.next().charAt(0);
        long b = sc.nextLong();

        if (b != 0) {

            switch (op) {
                case '+':
                    System.out.println((a + b));
                    break;
                case '-':
                    System.out.println((a - b));
                    break;
                case '/':
                    System.out.println((a / b));
                    break;
                case '*':
                    System.out.println((a * b));
                    break;
                default:
                    System.out.println("Unknown operator");
                    break;
            }
        } else {
            System.out.println("Division by 0!");
        }

    }
}