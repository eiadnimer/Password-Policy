package org.example;

import org.example.password.SymbolsPasswordRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymbolsPasswordRuleTest {

    private final SymbolsPasswordRule symbolsPasswordRule = new SymbolsPasswordRule();

    @Test
    public void should_contains_just_symbol_otherwise_return_0() {
        String password = "sfs345lwV";
        Assertions.assertEquals(0, symbolsPasswordRule.score(password));
    }
}
