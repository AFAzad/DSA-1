public class SelectionSort {
    public static void main(String[] args){
        int[]arr = {10,8,16,250,124,85,6,85};
       int  n = arr.length;
        for(int i = 0; i <n; i++){
            int min = arr[i];
            int pos = i;
            for(int j = i+1;j<n; j++){
                
                if(arr[j]<min){
                    min = arr[j];
                    pos = j;
                }
            }
            //Swap
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        //print

        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
