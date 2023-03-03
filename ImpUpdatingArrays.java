
import java.util.Arrays;

public class ImpUpdatingArrays {
    public static void main(String[] args) {
        String [] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        System.out.println(Arrays.toString(menu));

        String [] newMenu = new String[5];
        // newMenuという5つ値が入るArrayを作成

        for(int i = 0; i < menu.length; i++){
            newMenu[i] = menu[i];
        }
        // menuの数だけ、newMenuを更新

        newMenu[3] = "Latte";
        newMenu[4] = "Moca";
        System.out.println(Arrays.toString(newMenu));

    }
}
