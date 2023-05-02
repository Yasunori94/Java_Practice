public class Main{
    public static void main(String[] args) {
        double d = 1;
        float f = 1; 
        long l = 1;
        int i = 1;
        short s = 1;
        byte b = 1;

        // double > float > long > int > short > byte
        // 小さい値（float以下）を大きい値（double）に変換しようとすると、エラーが発生する。

        f = d;
    }
}