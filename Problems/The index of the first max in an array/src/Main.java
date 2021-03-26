import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i]>array[max]){
                max = i;
            }
        }
        sc.close();
        System.out.println(max);
    }
}