package main.java.com.sanjay.lamda;

import main.java.com.sanjay.java8.lamda.LamdaExampleItf;

public class LamdaExamples {



    public static void main(String[] args) {

        LamdaExampleItf lmdPrinter = (String name) -> {
            System.out.println("Sanjay "+name);
        };

        LamdaExampleItf lmdPrinterDaugterPrinter = (String name) -> {
            System.out.println("Rishita " + name);
        };


        myFuncInterface methodToPrint = () -> {
            System.out.println("Default name");
        };

        methodToPrint.methodToPrint();


        lmdPrinter.printName("Lamda ok!");
        lmdPrinterDaugterPrinter.printName("myDaughter");

    }



}

interface myFuncInterface {
    void methodToPrint();
}
