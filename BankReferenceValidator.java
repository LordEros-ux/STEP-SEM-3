import java.util.*;

public class BankReferenceValidator {

    static String normalizeReference(String raw) {
        raw = raw.trim();

        if (raw.length() >= 3) {
            return raw.substring(0, 3).toUpperCase() + raw.substring(3);
        }

        return raw.toUpperCase();
    }

    static String validateAndFormat(String reference) {

        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }

        // first 3 letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        // remaining 11 digits
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain digits only";
            }
        }

        String bank = reference.substring(0, 3);
        String date = reference.substring(3, 9);   // ddMMyy
        String seq = reference.substring(9);       // 5 digits

        StringBuilder sb = new StringBuilder();
        sb.append("[")
          .append(bank)
          .append("] DATE: ")
          .append(date.substring(0, 2)).append("/")
          .append(date.substring(2, 4)).append("/")
          .append(date.substring(4, 6))
          .append(" | SEQ: ")
          .append(seq);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String raw = sc.nextLine();

        String normalized = normalizeReference(raw);

        System.out.println(validateAndFormat(normalized));
    }
}