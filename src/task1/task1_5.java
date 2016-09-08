package task1;

/**
 * Created by Eugene on 01.07.2016.
 */
public class task1_5 {
    public static void main(String[] args) {
        int arr[][] = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();


        }
    }
}