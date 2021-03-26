import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }

        int count = 0;
        int num = 0;
        for (int i : array) {
            if (num < i){
                num = i;
                count ++;
            }
        }


        System.out.println(count);
    }
}