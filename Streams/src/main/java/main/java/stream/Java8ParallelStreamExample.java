package main.java.main.java.stream;

import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Java8ParallelStreamExample {


    public static void main(String[] args) {

        long start = System.nanoTime();
        long count = LongStream.rangeClosed(1, 1000000000).sequential().filter(i -> i % 2 == 0).sum();
        //LongStream.rangeClosed(1, 100000000).parallel().filter(i -> i % 2 == 0);

        long end =  System.nanoTime() - start;
        System.out.println(count);
        System.out.println("time taken "+ end);


        //Data set - 1000000000
        //519113645 - parallel
        //1399678439 - Sequential

        //Data set - 100000000
        //207999819 - seq
        //188918877 - par

        //Data set - 10000000
        //103843147 - par
        //77970943 - seq

        //Data set - 1000000
        //61538499 - seq
        //105350827 - para

        /*Longer the data set better performance with parallel stream*/





    }



}
