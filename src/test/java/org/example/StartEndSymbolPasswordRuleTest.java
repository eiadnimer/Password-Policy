package org.example;

import org.example.password.StartEndSymbolPasswordRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartEndSymbolPasswordRuleTest {

    private final StartEndSymbolPasswordRule startEndSymbolPasswordRule = new StartEndSymbolPasswordRule();

    @Test
    public void should_starts_and_ends_with_symbols_otherwise_return_0() {
        String password = "@dgFSDf4@@d";
        Assertions.assertEquals(0, startEndSymbolPasswordRule.score(password));
    }
}
