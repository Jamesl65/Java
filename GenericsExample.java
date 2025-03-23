package test;

import java.util.*;

public class GenericsExample {

    public static void main(String[] args) {

        // read
        Printer<Integer> printer = new Printer<>(23);
        printer.print();
        Printer<Double> dPrint = new Printer<>(2.3);
        dPrint.print();
        shout("Hello", 2.5);
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        printList(list);
    }

    private static void printList(List<?> list) {
        System.out.println(list);
    }
    private static <T, V> void shout(T t1, V v1) {
        System.out.println(v1 +  "&" + t1 + " ***" );
    }
}
