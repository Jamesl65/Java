package test;
import java.util.*;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-100, -90, -3, -4, -5, -7, -6, -8, -9, -10));
        //        List.of(-100, -90, 3, 4, 5, 7, 6, 8, 9, 10);
        int max = maxResult(list);
        System.out.println(max);
    }
    // The function maxResult returns the maximum number of three numbers multiplied
    static int maxResult(List<Integer> list) {
        int len = list.size();
        if (len <= 3) {
            System.out.println("Error");
        }
        int max = 0;

        list = list.
                stream().
                sorted().
                collect(Collectors.toList());

        // Collections.sort(list);
        max = list.get(len - 1) * list.get(len - 2) * list.get(len - 3);
        int max2 = list.get(len - 1) * list.get(0) * list.get(1);
        if (max2 > max)
            max = max2;
        return max;
    }
}