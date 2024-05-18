package org.example;

import org.example.password.NumbersPasswordRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersPasswordRuleTest {

    private final NumbersPasswordRule numbersPasswordRule = new NumbersPasswordRule();

    @Test
    public void should_contains_just_numbers_otherwise_return_0() {
        String password = "lsdkslk";
        Assertions.assertEquals(0, numbersPasswordRule.score(password));
    }
}
