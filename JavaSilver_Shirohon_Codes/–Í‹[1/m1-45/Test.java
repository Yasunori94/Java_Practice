import java.util.*;
class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Gold", "Silver", "Bronze"));
        list.forEach(e -> System.out.println(e));
    }
}