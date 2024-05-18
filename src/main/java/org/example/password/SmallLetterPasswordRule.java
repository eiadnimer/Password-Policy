package org.example.password;

public class SmallLetterPasswordRule implements PasswordRule {

    private static final String smallLetter = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public int score(String password) {
        for (char c : password.toCharArray()) {
            if (smallLetter.contains(Character.toString(c))) {
                return 1;
            }
        }
        return 0;
    }
}
