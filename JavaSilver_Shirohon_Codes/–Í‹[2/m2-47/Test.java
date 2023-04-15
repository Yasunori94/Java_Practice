class Test {
    public static void main(String[] args) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        sb = sb.append("Java ");
        sb = sb.append("Programming");
        sb.delete(5,16);
        str = sb.toString();
        str = str.trim();
        System.out.println(str.length());
    }
}