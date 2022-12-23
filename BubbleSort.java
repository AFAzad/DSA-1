public class BubbleSort {

    
    public static void PrintArray(int[] arr){
        
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        System.out.println();
        }
       
    }
   public static void main(String[] args){

    

    int[] arr = {10, 50, 30 , 25, 90, 80};

    

    for(int i=0; i < arr.length-1; i++){
        int j;
        for(j=0; j <arr.length-i-1; i++){
            
            if(arr[j]>arr[j+1]){
                int temp = arr[i];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    PrintArray(arr);
   } 
}
