public class Sample {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            System.out.print(num + 1);
        }
    }
}