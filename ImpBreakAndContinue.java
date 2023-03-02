public class ImpBreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            if(i%2 == 0){
                System.out.println("even");
                continue;
                // 偶数の場合は、次のライン sysout をスキップせよ
            }
            System.out.println("odd");
        }
    }
}
