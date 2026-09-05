package arrays.assigment_problems;

import java.util.Arrays;

public class Problem3 {

    static int[] topThree(int[] scores) {

        int[] top = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int score : scores) {

            if (score > top[0]) {
                top[2] = top[1];
                top[1] = top[0];
                top[0] = score;

            } else if (score > top[1]) {
                top[2] = top[1];
                top[1] = score;

            } else if (score > top[2]) {
                top[2] = score;
            }
        }

        return top;
    }

    public static void main(String[] args) {

        int[] scores = {50, 90, 70, 90, 60};

        System.out.println(Arrays.toString(topThree(scores)));
    }
}
