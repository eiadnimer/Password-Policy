package org.example;

import org.example.password.LengthPasswordRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthPasswordRuleTest {
    private final LengthPasswordRule lengthPasswordRule = new LengthPasswordRule();
    @Test
    public void length_should_be_more_than_8_otherwise_return_zero() {
        String password = "123cvfgn";
        Assertions.assertEquals(0, lengthPasswordRule.score(password));
    }
}
