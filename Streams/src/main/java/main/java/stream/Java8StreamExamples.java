package main.java.main.java.stream;

import java.util.Arrays;
import java.util.List;

public class Java8StreamExamples {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1","b1","c1","d1");

        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).forEach(s -> System.out.println(s));


    }
}
