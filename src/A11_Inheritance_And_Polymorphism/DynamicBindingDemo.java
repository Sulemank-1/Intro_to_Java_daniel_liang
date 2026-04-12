package A11_Inheritance_And_Polymorphism;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Personn());
        m(new Object());
    }

    public static void m(Object x){
        System.out.println(x.toString());
    }


}

class GraduateStudent extends Student{

}

class Student extends Personn{
    @Override
    public String toString(){
        return "Student";
    }
}

class Personn extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}
