package test;

import java.util.*;
import java.io.*;

class Catalan {
    public static long catalanNumber(int num) {
        // code goes here
        long result = factorial(2*num)/factorial(num + 1)/factorial(num);
        return result;
    }

    public static long catalanNumber2(int num) {
        // code goes here
        long result = 0;
        if (num == 0) return 1;
        for (int i = 0; i < num; i ++)
            result += catalanNumber2(i) * catalanNumber2(num - 1 - i);
        return result;
    }

    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i ++)
            result *= i;
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        int input = Integer.parseInt(s.nextLine());
        System.out.println(catalanNumber(input));
        System.out.println(catalanNumber2(input));
    }

}


