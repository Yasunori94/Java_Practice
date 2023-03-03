public class LoopAnArray {
    public static void main(String[] args) {
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "East Anglia"};

        System.out.println(kingdoms.length);

        for (int i = 0; i < 4; i++){
            System.out.println(kingdoms[i]);
        }
    }
}
