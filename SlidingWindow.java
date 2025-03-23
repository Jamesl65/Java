package test;


public class SlidingWindow {

    public static void main(String[] args) {

        int goal = 15;
        int[] nums = {4, 5, 17, 0, 1, 8, 12, 3, 6, 9};

        int left = -1, sum = 0, best = 0, start = 0;
        for (int curr = 0; curr < nums.length; curr ++) {
            sum += nums[curr];
            while (sum >= goal) {
                left++;
                sum -= nums[left];
            }
            if (best < curr - left) {
                best = curr - left;
                start = left + 1;
            }
        }
        System.out.println(best + " " + start);
    }
}
