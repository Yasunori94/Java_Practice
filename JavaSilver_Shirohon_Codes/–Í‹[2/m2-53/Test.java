class Test {
    public static void main(String args[]) throws RuntimeException {
        String[] list = null;
        try {
            for(var x:list){
                System.out.print(x);
            }
            throw new RuntimeException("Exception");
        } catch (RuntimeException re) {
            System.out.print(re.getMessage());
        }
        System.out.print("Java");
    }
}