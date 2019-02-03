package ru.nastya;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RomainanNumberTest {

    public RomainanNumber num;

    @BeforeEach
    public void setUp(){
        num = new RomainanNumber(1);
    }

    @Test
    public void test_getResults1() {
        num.getResults("C", "D", "M", 1);
        assertEquals(num.resStr(), "C");
    }

    @Test
    public void test_getResults2() {
        num.getResults("C", "D", "M", 2);
        assertEquals(num.resStr(), "CC");
    }

    @Test
    public void test_getResults3() {
        num.getResults("C", "D", "M", 3);
        assertEquals(num.resStr(), "CCC");
    }

    @Test
    public void test_getResults4() {
        num.getResults("C", "D", "M", 4);
        assertEquals(num.resStr(), "CD");
    }

    @Test
    public void test_getResults5() {
        num.getResults("C", "D", "M", 5);
        assertEquals(num.resStr(), "D");
    }

    @Test
    public void test_getResults6() {
        num.getResults("C", "D", "M", 6);
        assertEquals(num.resStr(), "DC");
    }

    @Test
    public void test_getResults7() {
        num.getResults("C", "D", "M", 7);
        assertEquals(num.resStr(), "DCC");
    }

    @Test
    public void test_getResults8() {
        num.getResults("C", "D", "M", 8);
        assertEquals(num.resStr(), "DCCC");
    }

    @Test
    public void test_getResults9() {
        num.getResults("C", "D", "M", 9);
        assertEquals(num.resStr(), "CM");
    }

    @Test
    public void test_getResult11() {
        num.getResults("X", "L", "C", 1);
        assertEquals(num.resStr(), "X");
    }

    @Test
    public void test_getResult22() {
        num.getResults("X", "L", "C", 2);
        assertEquals(num.resStr(), "XX");
    }

    @Test
    public void test_getResult33() {
        num.getResults("X", "L", "C", 3);
        assertEquals(num.resStr(), "XXX");
    }

    @Test
    public void test_getResult44() {
        num.getResults("X", "L", "C", 4);
        assertEquals(num.resStr(), "XL");
    }

    @Test
    public void test_getResult55() {
        num.getResults("X", "L", "C", 5);
        assertEquals(num.resStr(), "L");
    }

    @Test
    public void test_getResult66() {
        num.getResults("X", "L", "C", 6);
        assertEquals(num.resStr(), "LX");
    }

    @Test
    public void test_getResult77() {
        num.getResults("X", "L", "C", 7);
        assertEquals(num.resStr(), "LXX");
    }

    @Test
    public void test_getResult88() {
        num.getResults("X", "L", "C", 8);
        assertEquals(num.resStr(), "LXXX");
    }

    @Test
    public void test_getResult99() {
        num.getResults("X", "L", "C", 9);
        assertEquals(num.resStr(), "XC");
    }

    @Test
    public void test_getResult111() {
        num.getResults("I", "V", "X", 1);
        assertEquals(num.resStr(), "I");
    }

    @Test
    public void test_getResult222() {
        num.getResults("I", "V", "X", 2);
        assertEquals(num.resStr(), "II");
    }

    @Test
    public void test_getResult333() {
        num.getResults("I", "V", "X", 3);
        assertEquals(num.resStr(), "III");
    }

    @Test
    public void test_getResult444() {
        num.getResults("I", "V", "X", 4);
        assertEquals(num.resStr(), "IV");
    }

    @Test
    public void test_getResult555() {
        num.getResults("I", "V", "X", 5);
        assertEquals(num.resStr(), "V");
    }

    @Test
    public void test_getResult666() {
        num.getResults("I", "V", "X", 6);
        assertEquals(num.resStr(), "VI");
    }

    @Test
    public void test_getResult777() {
        num.getResults("I", "V", "X", 7);
        assertEquals(num.resStr(), "VII");
    }

    @Test
    public void test_getResult888() {
        num.getResults("I", "V", "X", 8);
        assertEquals(num.resStr(), "VIII");
    }

    @Test
    public void test_getResult999() {
        num.getResults("I", "V", "X", 9);
        assertEquals(num.resStr(), "IX");
    }

    @Test
    public void test_getRes() {
        num.setRes("L");
        num.getResults("I", "V", "X", 2);
        assertEquals(num.resStr(), "LII");
    }

    @Test
    public void test_getRes2() {
        num.getResults("a", "b", "c", 8);
        assertEquals(num.resStr(), "baaa");
    }

}