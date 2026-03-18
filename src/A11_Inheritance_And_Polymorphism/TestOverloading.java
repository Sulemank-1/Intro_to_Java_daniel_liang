package A11_Inheritance_And_Polymorphism;

public class TestOverloading {
    public static void main(String[] args) {
        a a = new a();
        a.p(10);
        a.p(10.0);
    }
}

class b{
    public void p(double i){
        System.out.println(i*2);
    }
}

class a extends b{
    public void p(int i){
        System.out.println(i);
    }
}