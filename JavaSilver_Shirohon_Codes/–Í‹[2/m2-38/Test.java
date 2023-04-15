class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Java");
        sb.append("Silver");
        sb.insert(4, " ");
        sb.replace(6, 12, "E");
        System.out.println(sb);
    }
}