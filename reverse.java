public class reverse {
    public static void main(String[] args) {
        int[] nums = {2,4,5,7,4};
        int[] result = new int[nums.length];

        int j=0;

        for (int i = nums.length-1; i >= 0; i--) {
            result[j] = nums[i];
            j++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(result[i] + " ");   
        }
    }
}