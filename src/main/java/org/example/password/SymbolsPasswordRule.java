package org.example.password;

public class SymbolsPasswordRule implements PasswordRule {

    private static final String symbols = "@_-+=()*&^%$#!/|:;'{}[]<>";

    @Override
    public int score(String password) {
        for (char c : password.toCharArray()) {
            if (symbols.contains(Character.toString(c))) {
                return 1;
            }
        }
        return 0;
    }
}
