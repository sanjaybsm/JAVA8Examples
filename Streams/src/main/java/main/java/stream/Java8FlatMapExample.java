package main.java.main.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

import static java.util.stream.Collectors.toList;

public class Java8FlatMapExample {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello","World");

        List<String[]> listWithMap = words.stream().map(word -> word.split(" "))
                                    .distinct().collect(toList());

        listWithMap.forEach(s -> System.out.println(Arrays.toString(s)));

        for(int i = 0;i < listWithMap.size();i++){
            String[] string = listWithMap.get(i);
            System.out.println(Arrays.toString(string));
        }


        /*flatmap*/

        List<String> distinctChar = words.stream()
                .map(word -> word.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());


        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool.getParallelism());


    }

}
