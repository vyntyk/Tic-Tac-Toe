package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();
        char[] inputArr = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        for (int i = 0; i < a1.length(); i++) {
            char temp = a1.charAt(i);
            if (temp == 'O' || temp == 'X' || temp == '_') {
                inputArr[i] = a1.charAt(i);
            }
        }
        String start = "| ";
        String end = " |";

        System.out.println("---------");
        System.out.println(start + inputArr[0] + " " + inputArr[1] + " " + inputArr[2] + end);
        System.out.println(start + inputArr[3] + " " + inputArr[4] + " " + inputArr[5] + end);
        System.out.println(start + inputArr[6] + " " + inputArr[7] + " " + inputArr[8] + end);
        System.out.print("---------");
    }
}