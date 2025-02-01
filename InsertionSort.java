import java.util.Arrays;

public class InsertionSort {

    int this_i, this_j; 
    public void sorting(int ar[]) {
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j >0; j--) {
                
                if (ar[j-1] > ar[j]) {
                    int t = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = t;
                }

                System.out.println(Arrays.toString(ar));
            }

            System.out.println(Arrays.toString(ar));
            
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        InsertionSort b = new InsertionSort();
        int[] ary = { 1, 9, 8, 2, 7, 3, 6, 4, 5}; 
        b.sorting(ary);
        System.out.println(Arrays.toString(ary));
    }
}