import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<Integer,String>map = new HashMap<>();

        map.put(20, "anshu");
        map.put(30, "krish");

        System.out.println(map);
        System.out.println(map.get(20));
    }
}
