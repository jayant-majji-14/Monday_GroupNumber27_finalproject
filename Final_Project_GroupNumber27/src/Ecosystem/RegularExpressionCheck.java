package Business.RegularExpressionCheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class for validating various inputs using regular expressions.
 */
public class RegularExpressionCheck {

    /**
     * Validates a user name using a regex pattern.
     * @param userName The user name to validate.
     * @return True if valid, otherwise false.
     */
    public static boolean isValidUserName(String userName) {
        Pattern pattern = Pattern.compile("^[a-zA-Z\\u0080-\\u024F]+([ .'-]?[a-zA-Z\\u0080-\\u024F]+)*$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }

    /**
     * Validates a name using a regex pattern.
     * @param name The name to validate.
     * @return True if valid, otherwise false.
     */
    public static boolean isValidName(String name) {
        return isValidUserName(name); // Reusing the userName pattern
    }

    /**
     * Validates an email address using a regex pattern.
     * @param email The email address to validate.
     * @return True if valid, otherwise false.
     */
    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * Validates a password using a regex pattern.
     * Password must contain at least one uppercase letter, one lowercase letter, one number, and one special character, and be 8-20 characters long.
     * @param password The password to validate.
     * @return True if valid, otherwise false.
     */
    public static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    /**
     * Validates a phone number using a regex pattern.
     * The phone number must be exactly 10 digits.
     * @param phoneNumber The phone number to validate.
     * @return True if valid, otherwise false.
     */
    public static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
