public class MaxElement {
    public static void main(String[] args){
        int [] arr = {50,68,74,25,98,144};
        
        int max = 0;
        
        for(int result: arr){
            if(result>max){
                max = result;
            }
        }
        System.out.println("The max elementis " +max+" ");

        //to find min elemet

        int min = 74;
        for(int result: arr){
            if(result<min){
                min= result;
            }
        }
        System.out.println("The min element is "+min+" ");
    }
}
