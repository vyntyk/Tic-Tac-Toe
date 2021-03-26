import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int [3];
        int[] array2 = new int [3];
        int value1 = 0;
        int value2 = 0;

        for (int i = 0; i < 3; i++) {
            array1[i] = sc.nextInt();
        }
        for (int j = 0; j < 3; j++) {
            array2[j] = sc.nextInt();
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        value1 = array1[0]*array1[1]*array1[2];
        value2 = array2[0]*array2[1]*array2[2];
        boolean res = false;
        for (int k = 0; k < 3; k++) {
            if(array1[k]==array2[k]){
                res = true;
            }
        }
        System.out.println(res ? "Incompatible" : value1 > value2 ? "Box 1 > Box 2" : "Box 1 < Box 2");
    }
}