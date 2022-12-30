import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        int n =Math.floorDiv(arr.length,2) ;
        int temp;


        for(int i =0; i<n;i++){
            temp =arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
        for(int result: arr){
            System.out.print(result +" ");
        }
    }
}
