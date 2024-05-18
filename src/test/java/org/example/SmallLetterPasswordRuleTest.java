package org.example;

import org.example.password.SmallLetterPasswordRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallLetterPasswordRuleTest {

    private final SmallLetterPasswordRule smallLetterPasswordRule = new SmallLetterPasswordRule();

    @Test
    public void should_contains_just_small_letters_otherwise_return_0() {
        String password = "ADFHF";
        Assertions.assertEquals(0, smallLetterPasswordRule.score(password));
    }
}
