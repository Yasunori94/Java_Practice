import java.util.ArrayList;
import java.util.HashSet;

class Test {
    public static void main(String args[]) {
        var list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        var map = new HashSet<Integer>(list);
        list.clear();
        list.add(3);
        for(int x:map){
            System.out.print(x);
        }
    }
}