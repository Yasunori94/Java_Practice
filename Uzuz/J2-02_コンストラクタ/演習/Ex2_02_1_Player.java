import java.util.Scanner;

public class Ex2_02_1_Player {

    final String G = "グー";
    final String C = "チョキ";
    final String P = "パー";

    String name;
    String handStatus;
    String result;

    Ex2_02_1_Player (String playerName){
        this.name = playerName;
    }

    String makeHandStatus() {
        double h = Math.random()*3+1;
        int h2 = (int)h;

        switch(h2){
            case 1: this.handStatus = G; break;
            case 2: this.handStatus = C; break;
            case 3: this.handStatus = P; break;
            default: this.handStatus = "";

        }

        return handStatus;
    }

    String playerChoice(){
        Scanner sc = new Scanner(System.in);
        this.handStatus = sc.nextLine();

        while(!(this.handStatus.equals(G) || this.handStatus.equals(C) || this.handStatus.equals(P))){
            System.out.println("もう一度選択してください。");
            this.handStatus = sc.nextLine();
        }
        sc.close();

        return handStatus;
    }

    // String judge(){

    //     if((playerChoice().equals("グー") && makeHandStatus().equals("チョキ")) || 
    //     (playerChoice().equals("チョキ") && makeHandStatus().equals("パー")) || 
    //     (playerChoice().equals("パー") && makeHandStatus().equals("グー"))){
    //         this.result = "\nあなたの勝ちです！";
    //     }
    //     else if(playerChoice().equals(makeHandStatus())){
    //         this.result = "\nあいこです！";
    //     }
    //     else{
    //         this.result = "\nあなたの負けです....";
    //     }

    //     return result;
    // }
}