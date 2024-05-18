package org.example.password;

public class NumbersPasswordRule implements PasswordRule {

    private static final String numbers = "0123456789";

    @Override
    public int score(String password) {
        for (char c : password.toCharArray()) {
            if (numbers.contains(Character.toString(c))) {
                return 1;
            }
        }
        return 0;
    }
}
