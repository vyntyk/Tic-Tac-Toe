import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNext()) {
            int in = sc.nextInt();
            if (in == 0) {
                break;
            }else {
                sum = sum + in;
                if (sum >= 1000) {
                    sum = sum - 1000;
                    break;
                }

            }

        }
        System.out.println(sum);
    }
}