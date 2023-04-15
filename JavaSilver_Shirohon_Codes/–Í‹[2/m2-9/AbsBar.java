class FooEx extends Exception{}
class BarEx extends FooEx{}
interface FooIF {
    abstact void foo() throws BarEx;
    public void bar() throws FooEx;
}
abstract class AbsBar implements FooIF {
    public void foo() throws FooEx{}
    public abstract void bar();
}