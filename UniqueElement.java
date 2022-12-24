import java.io.*;
import java.util.*;
public class UniqueElement{
    public static void main(String[] args){
        // using brut force
        int arr[] = {10, 5,8, 1 , 10, 4, 5, 9, 3, 8 };
        System.out.println("Unique elements are");

        int n = 10;
        for(int i =0; i <n; i ++){
            int num = 0;
            for(int j =0; j <n; j++){
                if(arr[j]==arr[i])num++;
            }
            if(num==1)System.out.print(arr[i]+" ");
        }
        // Time complexity is O(n^2)
       
    }
}