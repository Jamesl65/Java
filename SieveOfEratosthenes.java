package test;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int N = 100;
        int[] array = new int[N + 1];
        boolean[] flag = new boolean[N + 1];
        for (int i = 2; i <= N; i ++) {
            array[i] = i;
            flag[i] = true;
        }
        for (int i = 2; i <= N; i ++) {
            int sieve = i;
            if (flag[i])
                for (int j = sieve * 2; j <= N; j += sieve)
                    flag[j] = false;
        }
        for (int i = 2; i <= N; i ++) {
            if (flag[i])
                System.out.print(i + " ");
        }
    }
}
