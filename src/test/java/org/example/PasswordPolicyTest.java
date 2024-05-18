package org.example;

import org.example.password.PasswordPolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordPolicyTest {

    private final PasswordPolicy passwordPolicy = new PasswordPolicy();

    @Test
    public void password_strength_should_return_0_if_password_equals_null() {
        int result = passwordPolicy.checkStrength("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void password_strength_should_return_1_if_password_equals_one_number() {
        int result = passwordPolicy.checkStrength("5");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void password_strength_should_return_1_if_password_equals_one_symbol() {
        int result = passwordPolicy.checkStrength("@");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void password_strength_should_return_1_if_password_equals_one_capital_letter() {
        int result = passwordPolicy.checkStrength("L");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void password_strength_should_return_1_if_password_equals_one_small_letter() {
        int result = passwordPolicy.checkStrength("m");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void password_strength_should_return_1_if_password_just_numbers_and_the_length_below_8() {
        int result = passwordPolicy.checkStrength("3366539");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void password_strength_should_return_2_if_password_just_symbols_and_the_length_below_8() {
        int result = passwordPolicy.checkStrength("!@#%^&");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void password_strength_should_return_1_if_password_just_capital_letters_and_the_length_below_8() {
        int result = passwordPolicy.checkStrength("ASDLGHNK");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void password_strength_should_return_1_if_password_just_small_letters_and_the_length_below_8() {
        int result = passwordPolicy.checkStrength("sdkbgmh");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void password_strength_should_return_2_if_password_just_numbers_and_symbols_and_the_length_below_8() {
        int result = passwordPolicy.checkStrength("#45^&*9");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void password_strength_should_return_2_if_password_just_numbers_and_capital_letters_and_the_length_below_8() {
        int result = passwordPolicy.checkStrength("12AE45TT");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void password_strength_should_return_2_if_password_just_numbers_and_small_letters_and_the_length_below_8() {
        int result = passwordPolicy.checkStrength("vjgkt665");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void password_strength_should_return_2_if_password_just_symbols_and_small_letters_and_the_length_below_8() {
        int result = passwordPolicy.checkStrength("as%g&h*");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void password_strength_should_return_2_if_password_just_capital_letters_and_small_letters_and_the_length_below_8() {
        int result = passwordPolicy.checkStrength("FgFgFgUb");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void Password_strength_should_return_3_if_password_contains_numbers_and_capital_letters_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("123DDFGD12");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void Password_strength_should_return_3_if_password_contains_numbers_and_small_letters_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("sdf234fgh");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void Password_strength_should_return_3_if_password_contains_symbols_and_capital_letters_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("@#$%AS@#(G");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void Password_strength_should_return_3_if_password_contains_numbers_and_symbols_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("12@345^:';");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void Password_strength_should_return_3_if_password_contains_small_letters_and_symbols_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("asd#$%^fbgh");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void Password_strength_should_return_3_if_password_contains_small_letters_and_capital_letters_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("asdSDFbgHj");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void password_strength_should_return_4_if_password_contains_numbers_symbols_all_letters_but_length_below_8() {
        int result = passwordPolicy.checkStrength("1As@Fg@3");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void password_strength_should_return_4_if_password_contains_numbers_symbols_small_letters_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("rwd12345@)");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void password_strength_should_return_4_if_password_contains_numbers_symbols_capital_letters_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("AS@#456GH7**");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void password_strength_should_return_4_if_password_contains_capital_letters_symbols_small_letters_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("AAAsss@#$%^Hb");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void password_strength_should_return_4_if_password_contains_numbers_and_all_the_letters_length_higher_than_eight() {
        int result = passwordPolicy.checkStrength("123asDFG45HNJf");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void password_strength_should_return_5_if_password_contains_numbers_symbols_all_letters_and_length_higher_than_8() {
        int result = passwordPolicy.checkStrength("aV|7$eI<4c_;");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void should_return_6_if_password_contains_numbers_symbols_all_letters_and_length_higher_than_8_and_start_end_with_symbol() {
        int result = passwordPolicy.checkStrength("$V|7$eI<4c_;");
        Assertions.assertEquals(6, result);
    }
}
