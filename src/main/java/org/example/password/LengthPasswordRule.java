package org.example.password;

public class LengthPasswordRule implements PasswordRule {
    @Override
    public int score(String password) {
        if (password.length() > 8) {
            return 1;
        }
        return 0;
    }
}
