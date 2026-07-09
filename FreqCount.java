import java.util.HashMap;

public class FreqCount {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1,3,1,2,3,1};

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num,1);
            }
        }
        System.out.println(map);
    }
}
