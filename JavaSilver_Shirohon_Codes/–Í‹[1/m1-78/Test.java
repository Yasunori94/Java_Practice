import java.io.IOException;

class Test {
    public static void main(String args[]) {
        try {
            Test.ex();
            System.out.print("Hello");
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        System.out.print("Java");
    }
    public static void ex() throws IOException,RuntimeException{
        throw new RuntimeException("Exception");
    }
}