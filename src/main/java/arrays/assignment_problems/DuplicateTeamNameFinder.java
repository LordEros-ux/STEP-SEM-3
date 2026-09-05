package arrays.assignment_problems;

import java.util.HashSet;

public class DuplicateTeamNameFinder {

    static void findDuplicates(String[] teams) {
        HashSet<String> seen = new HashSet<>();

        for (String team : teams) {
            if (seen.contains(team)) {
                System.out.println("Duplicate team: " + team);
            } else {
                seen.add(team);
            }
        }
    }

    public static void main(String[] args) {
        String[] teams = {"Alpha", "Beta", "Gamma", "Alpha", "Delta", "Beta"};

        findDuplicates(teams);
    }
}

