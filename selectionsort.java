public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,2};
        

        for(int pass=0; pass< arr.length - 1; pass++){
            int maxindex = 0; 
            for(int i =0; i<arr.length-1-pass;i++){ 
                if(arr[i] > arr[maxindex]){
                    maxindex = i;
                }
            }
            int temp = arr[maxindex];
            arr[maxindex] = arr[arr.length-1-pass];
            arr[arr.length-1-pass] = temp;
        }
        for(int pass=0;pass<arr.length;pass++){
                System.out.println(arr[pass] + " ");
        }
    }
}