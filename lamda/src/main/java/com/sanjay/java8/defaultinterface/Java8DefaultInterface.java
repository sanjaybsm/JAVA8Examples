package main.java.com.sanjay.lamda.java8.defaultinterface;

public interface Java8DefaultInterface {

    void printName();

    default  void printMyName(String name){
        System.out.println("Printing the default value from default interface"+name);
    }


}
