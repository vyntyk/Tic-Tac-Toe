import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int len = input.length;
        boolean chek = false;

        for (int i = 0; i < len - 1; i++) {
            if (input[i].compareTo(input[i + 1]) <= 0){
                chek = true;
            }else {
                chek = false;
                break;
            }
        }
        System.out.println(chek);
    }
}