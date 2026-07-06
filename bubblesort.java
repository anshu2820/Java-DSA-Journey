public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,2};
         

        for(int pass=0; pass<= arr.length - 1; pass++){
            for(int i =0; i<arr.length-1-pass;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int pass=0;pass<arr.length;pass++){
                System.out.println(arr[pass] + " ");
        }
    }
}
