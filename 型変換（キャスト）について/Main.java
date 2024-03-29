public class Main{

    public static void main(String[] args) {

        A a = new B();
        // Aの型を使って、Bのインスタンスの作成が可能
        // しかし実際は、参照型がAであるだけなので（Bというインスタンスに包括されるAを参照しているだけ）、Bの機能は隠れて存在する。
        // アップキャスト：（B（サブクラス）のインスタンスが A（メインクラス）を参照する）

        // a.disp2();
        // しかしながら、Aの型を参照しているため、Bに存在するdisp2();は呼び出せない
        
        a.disp();
        // Aに存在するdisp()は呼び出せる

        B a2 = (B)a;
        // aを、Bの参照型に変換し、a2と名付ける
        // ダウンキャスト：Aを参照するインスタンスを、Bを参照するように変換する

        a2.disp2();
        // すると、Bの機能を呼び出すことができる



        A a3 = new A();
        // a3は、Aを参照型とするAのインスタンス

        // B a4 = (B)a3;
        // a3をBの参照型に変換することはできるが、a3自体は、Bの機能を持っていないため（インスタンス自体は、Aで作られているため）、ClasscastExeptionがスローされる。


        Int inter = new C();
        inter.func();
        
    }
}