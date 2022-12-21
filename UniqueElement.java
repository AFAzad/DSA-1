import java.util.Arrays;
import java.util.HashSet;

public class UniqueElement{
    public static void main(String[] args){
        int[] arr1 = {1,45,5,7,9,5};
        int[] arr2 = {2,1,5,6,1,9};

        int[] uniq = new int[arr1.length+arr2.length];



        int len1 = arr1.length;
        int len2 = arr2.length;

        // System.arrayCopy(arr1,0,uniq,0,len1);
        // System.arrayCopy(arr2,0,uniq,0,len2);

        Arrays.sort(uniq);

        System.out.println(Arrays.toString(uniq));

        HashSet s = new HashSet();

        for(int i = 0; i <uniq.length;i++){
            if(!s.contains(uniq[i])){
                s.add(uniq[i]);
                System.out.println(uniq[i]+" ");
            }
        }
    }
}