package arrays.assignment_problems;

import java.util.Arrays;

public class PlacementDriveShortlisting {

    static void shortlistCandidates(double[] scores, double cutoff) {
        Arrays.sort(scores);

        System.out.println("Shortlisted scores:");

        for (int i = scores.length - 1; i >= 0; i--) {
            if (scores[i] >= cutoff) {
                System.out.println(scores[i]);
            }
        }
    }

    public static void main(String[] args) {
        double[] scores = {72.5, 85.0, 91.5, 68.0, 88.5, 79.0};

        shortlistCandidates(scores, 80.0);
    }
}
