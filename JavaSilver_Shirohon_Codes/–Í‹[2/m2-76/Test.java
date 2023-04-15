import java.util.List;

class Test {
    public static void main(String args[]) {
        Object[] o = new Object[3];
        o[0] = new Integer[1];
        o[1] = new String[1];
        o[2] = List.of("J","a","v","a");
        for(Object l:o) {
            for(Object v:l){
                System.out.print(v);
            }
        }
    }
}