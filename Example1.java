package test;

public class Example1 {

    public static void main(String[] args) {

        // isPrime(9);
        for (int i = 2; i < 50; i ++) {
            int mirror = mirrorNumber(i);
            if (isPrime(i) && isPrime(mirror))
                System.out.println("Mirror Prime " + i + " " + mirror);
        }
    }

    static int mirrorNumber(int number) {
        String s = Integer.toString(number);
        return Integer.parseInt(reverse(s));
    }

    /*
    static String reverse(String s) {
        StringBuilder result = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i ++)
            result.append(s.charAt(len - 1 - i));
        return result.toString();
    }
    */

    static String reverse(String s) {
        StringBuilder result = new StringBuilder(s);
        return result.reverse().toString();
    }

    static boolean isPrime(int number) {
        int squarer = (int) Math.sqrt(number);
        boolean isPrime = true;
        for (int i = 2; i <= squarer; i ++) {
            if (number%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
