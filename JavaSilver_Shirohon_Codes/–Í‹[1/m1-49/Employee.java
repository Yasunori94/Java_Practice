class Employee {
    private String name;
    private static String compName;
    public Employee(String name, String comp) {
        this.name = name;
        this.compName = comp;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Taro", "AAA");
        Employee e2 = new Employee("Hanako", "BBB");
        System.out.print(Employee.compName + " : ");
        System.out.print(e1.compName + " : ");
        compName = "CCC";
        System.out.print(e2.compName);
    }
}