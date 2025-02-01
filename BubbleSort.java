import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public void sorting(int [] ar){
        for(int i = 0; i<ar.length; i++){
            for(int j = i+1; j<ar.length-i-1; j++){
                int t = ar[i];
                if(ar[i]>ar[j]){
                    ar[i] = ar[j];
                    ar[j] = t;
                }
            }
        }
    }



    public static void main(String [] args){
        BubbleSort b = new BubbleSort();
    
        int [] ary = {1, 5, 2, 8, 9, 2};
        b.sorting(ary);
        
        System.out.println(Arrays.toString(ary));
    }
}
