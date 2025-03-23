package test;

import java.util.*;

class FindIntersection {
    public static String FindIntersection(String[] strArr) {
        // code goes here
        StringBuilder result = new StringBuilder();
        // int index1 = 0, index2 = 0;
        String str1 = strArr[0];
        String str2 = strArr[1];
        StringTokenizer token1 = new StringTokenizer(str1, " ,");
        StringTokenizer token2 = new StringTokenizer(str2, " ,");
        // int len1 = token1.countTokens();
        // int len2 = token2.countTokens();
        int num1 = 0;
        int num2 = 0;
        int compareRes = 0;
        while (token1.hasMoreElements() && token2.hasMoreElements() ) {
            if (compareRes == 0) {
                num1 = Integer.parseInt(token1.nextToken());
                num2 = Integer.parseInt(token2.nextToken());
            }
            if (compareRes == 1)
                num2 = Integer.parseInt(token2.nextToken());
            if (compareRes == -1)
                num1 = Integer.parseInt(token1.nextToken());

            compareRes = Integer.compare(num1, num2);
            if (compareRes == 0) {
                result.append("," + num1);
            }
        }
        return result.substring(1);
    }

    public static void main (String[] args) {
        // keep this function call here
        // Scanner s = new Scanner(System.in);
        // System.out.print(FindIntersection(s.nextLine()));

        String[] str = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.print(FindIntersection(str));
    }
}