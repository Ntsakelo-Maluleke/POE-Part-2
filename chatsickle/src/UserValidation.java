
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class UserValidation {
    public static boolean isValidUsername(String username) {
        return username.length() >= 5 && username.contains("_");
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String cleaned = phoneNumber.replaceAll("\\s+", "");
        if (!cleaned.startsWith("+27") || cleaned.length() != 12) return false;
        String localNum = cleaned.substring(3);
        return localNum.matches("[678]\\d{8}");
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        return Pattern.matches(".*[A-Z].*", password) &&
               Pattern.matches(".*[0-9].*", password) &&
               Pattern.matches(".*[!@#$%^&*()_+=<>?/{}].*", password);
    }
}
