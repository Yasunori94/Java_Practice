class Employee {
    private final String name;
    private final String skill = "none";
    public Employee(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }
    public void print() {
        System.out.println(name + " : " + skill);
    }
}
class Test {
    public static void main(String[] args) {
        new Employee("Duke", "Java").print();
    }
}