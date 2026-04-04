package A12_Exception_Handling_And_Text_IO;

public class ChainedException {
    static void main() {
        try {
            method1();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public static void method1() throws Exception{
        try {
            method2();
        }
        catch (Exception ex){
            throw new Exception("New info from method1", ex);
        }
    }

    public static void method2() throws Exception{
        throw new Exception("New info from method2");
    }
}
