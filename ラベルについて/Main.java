public class Main{
    public static void main(String[] args) {

        label1:
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                if (i==3){
                    break label1;
                    // iが3になれば、全体のfor構文(label1がついている)を終了させる。
                }
                System.out.print("* ");
            }
            System.out.println("");
        }

        String str = null;
        str += "null";
        System.out.println(str);
    }
}