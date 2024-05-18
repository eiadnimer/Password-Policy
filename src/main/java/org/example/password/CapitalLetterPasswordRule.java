package org.example.password;

public class CapitalLetterPasswordRule implements PasswordRule {

    private static final String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public int score(String password) {
        for (char c : password.toCharArray()) {
            if (capitalLetter.contains(Character.toString(c))) {
                return 1;
            }
        }
        return 0;
    }
}
