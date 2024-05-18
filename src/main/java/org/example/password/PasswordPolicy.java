package org.example.password;

import java.util.ArrayList;
import java.util.List;

public class PasswordPolicy {

    private final List<PasswordRule> rules = new ArrayList<>();

    public PasswordPolicy() {
        rules.add(new LengthPasswordRule());
        rules.add(new NumbersPasswordRule());
        rules.add(new SymbolsPasswordRule());
        rules.add(new CapitalLetterPasswordRule());
        rules.add(new SmallLetterPasswordRule());
        rules.add(new StartEndSymbolPasswordRule());
    }

    public int checkStrength(String password) {
        return rules.stream().mapToInt(rule -> rule.score(password))
                .sum();
    }
}