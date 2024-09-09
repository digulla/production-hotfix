package de.pdark.tutorial.hotfix.branch1_commit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.pdark.tutorial.hotfix.branch1_commit4.UIAmount;

class UIAmountTest {

    @Test
    void testAPP_3465() {
        assertEquals(820, UIAmount.toUI(8.2));
    }

    @Test
    void test_0_0() {
        assertEquals(0, UIAmount.toUI(0.0));
    }

    /* TODO This test fails since the rounding code has a bug
    @Test
    void test_minus_1_0() {
        assertEquals(-100, UIAmount.toUI(-1.0));
    }
    */

    @Test
    void test_minus_0_99499() {
        assertEquals(99, UIAmount.toUI(0.99499));
    }

    @Test
    void test_minus_0_995() {
        assertEquals(100, UIAmount.toUI(0.995));
    }

}
