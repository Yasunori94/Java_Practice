import java.util.Arrays;

class Test {
    public static void main(String args[]) {
        String[] strs = {"A","B","C","D"};
        String[] strs2 = {"A","B","c","D"};
        System.out.println(Arrays.mismatch(strs, strs2));
    }
}