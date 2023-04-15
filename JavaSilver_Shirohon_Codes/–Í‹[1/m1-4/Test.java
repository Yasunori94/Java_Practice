import java.util.*;
class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("SE", "EE", "ME"));
        Set<String> set = new HashSet<>(list);
        set.add("Java");
        list.clear();
        System.out.println(list.size() + " : " + set.size());
    }
}