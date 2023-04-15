public class Test {
    public static void main(String[] args) {
        int value1 = 0;
        int value2 = 0;
        do {
            if(true) continue;
            ++value1;
            System.out.print("In Loop ");
        }while(value1 == ++value2);
        System.out.print("After Loop ");
    }
}