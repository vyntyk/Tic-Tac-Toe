import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String[] entry = sc.nextLine().split(" ");
        int n = sc.nextInt();

        n = n % entry.length;

        for(int i = 0; i < n; i++){
            int j;
            String last;
            last = entry[entry.length-1];

            for(j = entry.length-1; j > 0; j--){
                entry[j] = entry[j-1];
            }
            entry[0] = last;
        }
        for(int i = 0; i< entry.length; i++){
            System.out.print(entry[i] + " ");
        }
    }
}