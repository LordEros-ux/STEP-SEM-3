package arrays.assignment_problems;

import java.util.Arrays;

public class Top3PodiumFinder {

    static void findTop3(int[] scores) {
        Arrays.sort(scores);

        int n = scores.length;

        System.out.println("1st: " + scores[n - 1]);
        System.out.println("2nd: " + scores[n - 2]);
        System.out.println("3rd: " + scores[n - 3]);
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 95, 88};

        findTop3(scores);
    }
}
