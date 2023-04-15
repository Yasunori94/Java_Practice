import java.util.List;

class Test {
    public static void main(String args[]) {
        int[] list = null;
        var vlist = List.of(list);
        int[] list2 = {1,2,3};
        vlist.add(1, list2);
        System.out.println(vlist.isEmpty());
    }
}