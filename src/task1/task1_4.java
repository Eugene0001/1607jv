package task1;

/**
 * Created by Eugene on 01.07.2016.
 */
public class task1_4 {
    public static void main(String[] args) {
        int array[][] = new int [10][];
        for (int i = 0; i <10;i++ ){
            array[i] = new int[i+1];
        }
        print2D(array);
    }
    static void print2D(int[][] array){
        for(int[] a: array){
            for(int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}