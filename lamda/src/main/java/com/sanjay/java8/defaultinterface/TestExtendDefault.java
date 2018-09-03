package main.java.com.sanjay.java8.defaultinterface;

public class TestExtendDefault implements main.java.com.sanjay.lamda.java8.defaultinterface.Java8DefaultInterface {
    @Override
    public void printName() {
        System.out.println("Name from concrete class");
    }


    public static void main(String[] args) {
        TestExtendDefault testExtendDefault = new TestExtendDefault();
        testExtendDefault.printName();
        testExtendDefault.printMyName("testname");


    }


}
