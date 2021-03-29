import java.util.Scanner;

class Main {
   public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] number = new int[n][n];
        boolean symmetric = true;
       for (int i = 0; i < number.length; i++) {
           for (int j = 0; j < number[i].length; j++) {
               number[i][j] = scanner.nextInt();
               
           }
       }
       for (int i = 0; i <number.length ; i++) {
           for (int j = i+1; j < number[i].length; j++) {
               if(number[i][j] != number[j][i]){
                   symmetric = false;
                   break;
               }
           }
           if (!symmetric){
               break;
           }
       }
       System.out.println(symmetric ? "YES":"NO");
   }
}
