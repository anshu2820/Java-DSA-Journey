public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        

        for(int pass=0; pass< arr.length - 1; pass++){ 
            for(int i = pass + 1; i>0;i--){ 
                if(arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
        for(int pass=0;pass<arr.length;pass++){
                System.out.println(arr[pass] + " ");
        }
    }
}
