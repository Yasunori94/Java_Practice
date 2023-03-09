import java.util.Scanner;

public class Ex2_02_1_Janken {
    public static void main(String[] args) {

        final String G = "グー";
        final String C = "チョキ";
        final String P = "パー";

        Scanner sc = new Scanner(System.in);
        System.out.println("名前を入力してください");
        String nameP1 = sc.nextLine();

        Ex2_02_1_Player me = new Ex2_02_1_Player(nameP1);
        Ex2_02_1_Player cp = new Ex2_02_1_Player("Computer");
        // Ex2_02_1_Player jd = new Ex2_02_1_Player("Judge");

        System.out.println("\n" + me.name + " vs " + cp.name);

        System.out.println("グー、チョキ、パーのいずれかを入力して下さい。");
        String playerHand = me.playerChoice();
        String cpHand = cp.makeHandStatus();

        System.out.println("\nあなたは　" + playerHand + "を出しました。");
        System.out.println("コンピューターは　" + cpHand + "を出しました。");


        if((playerHand.equals(G) && cpHand.equals(C)) || 
        (playerHand.equals(C) && cpHand.equals(P)) || 
        (playerHand.equals(P) && cpHand.equals(G))){
            System.out.println("\nあなたの勝ちです！");
        }
        else if(playerHand.equals(cpHand)){
            System.out.println("\nあいこです！");
        }
        else{
            System.out.println("\nあなたの負けです....");
        }

        sc.close();


    }
}
