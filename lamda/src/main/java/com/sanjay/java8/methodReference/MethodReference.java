package main.java.com.sanjay.java8.methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
       new MethodReference().testLamda();
    }

    public void testLamda(){
        List<String> list = Arrays.asList("Sa","Riii","Vijaa");

        //method reference
        list.sort(String::compareToIgnoreCase);
        list.forEach(x -> System.out.println(x.toUpperCase()));
    }
}
