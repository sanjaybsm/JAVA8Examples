package main.java.main.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8StreamExamples {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1","b1","c1","d1");

        /*Example for filter and map*/
        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).forEach(s -> System.out.println(s));


        //Exception will thrown at this line
       // myList.add("s");

        //Primitive Stream

        IntStream.of(1,2,3,4)
                .map(i -> i * 2)
                .filter(j -> j < 5)
                .forEach(z -> System.out.println(z));


        /*Intermidate operation - which doesn't print anything*/
        Stream.of("a","b","c")
                .filter(s -> {
                            System.out.println("filter "+s);
                            return true;
                        }
                );


        /*Terminal operation foreach*/
        Stream.of("a","b","c")
                .filter(s -> {
                            System.out.println("filter "+s);
                            return true;
                        }
                ).forEach(x -> System.out.println(x));


        Stream.of("a","b","c")
                .filter(s -> {
                            System.out.println("filter "+s);
                            return true;
                        }
                ).anyMatch(x -> {
            System.out.println("anymatch "+x);
                return x.equalsIgnoreCase("a");
        });


        /*Ordering of the Streams methods - not ideal way*/
        Stream.of("a","b","c")
                .map(s -> {
                    System.out.println("inside map "+s);
                    return s.concat("with topings");
                })
                .filter(s -> {
                    System.out.println("Inside filter "+s);
                    return s.contains("a");
                })
                .forEach(j -> System.out.println(j));

        /*Ordering of the Streams methods -  ideal way*/
        Stream.of("a","b","c")

                .filter(s -> {
                    System.out.println("Inside filter "+s);
                    return s.contains("a");
                })
                .map(s -> {
                    System.out.println("inside map "+s);
                    return s.concat("with topings");
                })
                .forEach(j -> System.out.println(j));




    }
}
