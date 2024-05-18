package org.example;

import org.example.password.CapitalLetterPasswordRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapitalLetterPasswordRuleTest {
    private final CapitalLetterPasswordRule capitalLetterPasswordRule = new CapitalLetterPasswordRule();

    @Test
    public void should_contains_just_capital_letters_otherwise_return_0() {
        String password = "sfsss";
        Assertions.assertEquals(0, capitalLetterPasswordRule.score(password));
    }

}
