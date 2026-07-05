public class linearse {
    public static void main(String[] args) {
        int[] arr = {12,25,8,40,15};
        int target = 25;

        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("element found at index:"+ i);
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("element not found");
            }
    }
}
