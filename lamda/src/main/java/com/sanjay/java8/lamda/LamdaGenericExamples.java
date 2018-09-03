package main.java.com.sanjay.java8.lamda;


public class LamdaGenericExamples {


    /*Lamda implementor with String and int*/

    public static void main(String[] args) {
        GenericFunctionalInterFace<Integer> intImplementor = (Integer i) -> {
            Integer x = i + 10;
            return x;
        };

        GenericFunctionalInterFace<String> stringImplementor = (String myName) -> {
            String x = myName + "Author";

            return x;
        };


        System.out.println(intImplementor.genericMethod(10));
        System.out.println(stringImplementor.genericMethod("Sanjay"));


    }


}
