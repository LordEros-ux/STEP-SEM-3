package arrays.assigment_problems;

public class Problem2 {

    static String findDuplicate(String[] names) {

        for (int i = 0; i < names.length; i++) {

            for (int j = i + 1; j < names.length; j++) {

                if (names[i].equals(names[j])) {
                    return "Duplicate: " + names[i];
                }
            }
        }

        return "No Duplicates";
    }

    public static void main(String[] args) {

        String[] names = {
            "Alpha",
            "Beta",
            "Gamma",
            "Alpha"
        };

        System.out.println(findDuplicate(names));
    }
}
