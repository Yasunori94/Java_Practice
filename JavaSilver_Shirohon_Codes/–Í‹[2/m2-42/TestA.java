interface TestA {
    public void funcA();
}
interface TestB {
    public static void funcB() { }
}
interface TestC extends TestA {
    public void funcC();
}
interface TestD extends TestB {
    public void funcD();
}
interface TestE{
    public default void funcE() { }
}