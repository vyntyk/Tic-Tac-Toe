import java.util.Scanner;

class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for (int i = 0; i < twoDimArray.length; i++) {
            int k = 0;
            int j = twoDimArray[i].length - 1;
            while (k <= j) {
                int temp = twoDimArray[i][k];
                twoDimArray[i][k] = twoDimArray[i][j];
                twoDimArray[i][j] = temp;
                k++;
                j--;
            }
        }
    }
}