interface TestA {
    public abstract void funcA();
}
interface TestB {
    public abstract void funcB();
}
interface TestC extends TestA, TestB {
    public abstract void funcC();
}
class TestD implements TestC {
    public void funcA() { }
    public void funcB() { }
    public void funcC() { }
}