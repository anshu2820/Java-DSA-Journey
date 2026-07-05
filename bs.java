public class bs {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};


        int low = 0;
        int high = arr.length -1;
        int target = 10;
        boolean found = false;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(target < arr[mid]){
                high = mid -1;
            }else if(target > arr[mid]){
                low = mid +1;
            }else{
                System.out.println("element found at index " + mid);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    } 
}
