public class Test {
    public static void main(String[] args) {
        int[] ary = {10, 20, 30};
        int i = ary.length;
        while(i >= 0) {
            System.out.println(ary[i--]);
        }
    }
}