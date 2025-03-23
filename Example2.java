package test;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(10);
        list.add(7);

        List<Integer> sorted = sortRocket(list);
        System.out.println(sorted);
    }

    static List<Integer> sortRocket(List<Integer> unsorted) {
        List<Integer> result = new ArrayList<>();

        int len = unsorted.size();
        for (int i = 0; i < len; i ++) {
            int min = unsorted.get(i);
            int pos = i;
            for (int j = i + 1; j < len; j ++) {
                if (min > unsorted.get(j)) {
                    min = unsorted.get(j);
                    pos = j;
                }
            }
            int temp = unsorted.get(i);
            unsorted.set(i , min);
            unsorted.set(pos, temp);
            // result.add(min);
        }
        // 2 4 6 8 10 9 7 5 3 1
        //  1 3 5 7 9 8 6 4 2

        if (len % 2 == 0) {
            for (int i = 1; i <= len; i = i + 2)
                result.add(unsorted.get(i));

            for (int i = len - 2; i >= 0; i = i - 2)
                result.add(unsorted.get(i));
        }
        else {
            for (int i = 0; i < len; i = i + 2)
                result.add(unsorted.get(i));

            for (int i = len - 2; i >= 0; i = i - 2)
                result.add(unsorted.get(i));

        }

        return result ;
    }
}
