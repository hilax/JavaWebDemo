import java.util.HashMap;

public class DebugDemo {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println("i = " + i);
        }
        HashMap<String , String> map = new HashMap<>();
        map.put("name","Tom");
        String name = map.get("name");
        System.out.println("name = " + name);
         map.remove("name");
        System.out.println(map);
    }
}
