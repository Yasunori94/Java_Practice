public class ExFor {
    public static void main(String[] args) {
        int[] array = new int[] {10,20,30};
        for(final var val : array) {
            System.out.print(val + " ");
        }
    }
}