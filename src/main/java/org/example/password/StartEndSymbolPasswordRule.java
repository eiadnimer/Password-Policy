package org.example.password;

public class StartEndSymbolPasswordRule implements PasswordRule {

    private static final String symbols = "@_-+=()*&^%$#!/|:;'{}[]<>";

    @Override
    public int score(String password) {
        if (password.isEmpty()) {
            return 0;
        }
        if (password.length() > 1) {
            if (symbols.contains(Character.toString(password.charAt(0))) &&
                    symbols.contains(Character.toString(password.charAt(password.length() - 1)))) {
                return 1;
            }
        }
        return 0;
    }
}
