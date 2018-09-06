package main.java.main.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8AdvanceOperationExmp {

    public static void main(String[] args) {


        List<Product> productList =Arrays.asList(new Product(1,"Toy","Excellent"),
                new Product(2,"Chocolate","Super"),new Product(3,"Pencil","Poor"),
                new Product(1,"Paper","Super"));

        System.out.println(productList);

    /*   List<Product> filteredProductList =  productList.
                stream()
                .filter(x -> x.getProductName().contains("T"))
                .collect(Collectors.toList());*/


        Map<Long,List<Product>> groupedList = productList.stream().collect(Collectors.groupingBy(p -> p.productId));
        System.out.println(groupedList);


      /*  String name = productList.stream().
                filter(s -> s.getProductName().contains("T"))
                .map(p -> p.getProductName()).collect(Collectors.joining("some string"));

                        System.out.println(name);

                */


        productList.stream()
                .reduce((p1,p2) -> p1.getProductId() > p2.getProductId() ? p1 : p2)
                .ifPresent(System.out::println);






    }

}
