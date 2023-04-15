class Test {
    public static void main(String[] args) {
        int x = 0, y = 0;
        int ans = 0;
        
        ans += ++x;
        System.out.print(ans + " : ");
        ans += y++;
        System.out.print(ans);
    }
}