import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        for (int i =1; i <=num; i++) {
            for(int j = 0; j < i; j ++) {
                if(count > num)
                    break;
                count ++;
                System.out.print(i + " ");
            }
        }
    }
}