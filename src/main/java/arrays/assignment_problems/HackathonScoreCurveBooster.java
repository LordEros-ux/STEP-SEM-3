package arrays.assignment_problems;

import java.util.Arrays;

public class HackathonScoreCurveBooster {

    static void curveScores(int[] scores, int bonus) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }

    public static void main(String[] args) {

        int[] scores = {70, 85, 90, 65, 80};
        int bonus = 5;

        curveScores(scores, bonus);

        System.out.println(Arrays.toString(scores));
    }
}
