package test;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 2, 1));
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list3 = new ArrayList<>(List.of(2 ,3));
        // int max = maxResult(list);
        System.out.println("Result is list1 & list2" + sameElement(list1, list2));
        System.out.println("Result is list1 & list3" + sameElement(list1, list3));

    }

    static boolean sameElement(List<Integer> list1, List<Integer> list2) {
        boolean result = false;

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        /*
        for (int num: list1)
            set1.add(num);

        for (int num: list2)
            set2.add(num);


         */
        result = set1.equals(set2);

        /*
        Thread t = new Thread();
        t.run();

        Collections.sort(list1);
        Collections.sort(list2);

        int len1 = list1.size();
        int len2 = list2.size();

        // 1 1 2 2 3 count1
        // 1 2 2 3 4
        /*

        int i = 0;
        for (int num: set1) {
            int num2 = set2.
        }
        */

        return result;
    }

    // The function maxResult returns the maximum number of three numbers multiplied
    static int maxResult(List<Integer> list) {
        int len = list.size();
        if (len <= 3) {
            System.out.println("Error");
        }
        int max = Integer.MIN_VALUE;
        Collections.sort(list);
        max = list.get(len - 1) * list.get(len - 2) * list.get(len - 3);
        int max2 = list.get(len - 1) * list.get(0) * list.get(1);
        if (max2 > max)
            max = max2;
        return max;
    }
}