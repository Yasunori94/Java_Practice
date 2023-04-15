import java.util.*;
class Test {
    public static void main(String[] args) {
        List<String> list = List.of("Java");
        Map<Integer, String> map = new HashMap<>();
        map.put(101, list.get(0));
        list.clear();
        System.out.println(map.get(101));
    }
}