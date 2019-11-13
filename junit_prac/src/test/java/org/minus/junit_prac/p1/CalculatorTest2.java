package org.minus.junit_prac.p1;

import org.junit.jupiter.api.*;

/**
 * Created by zhengsihan, on 2019-11-13
 */
class CalculatorTest2 {
    private static Calculator c = null;
    private static int a, b;

    @BeforeAll
    static void init() {
        c = new Calculator();
        System.out.println(String.format("初始化:a=%d,b=%d", a, b));
    }

    @AfterEach
    void last() {
        System.out.println(String.format("a=%d,b=%d", a, b));
    }

    @DisplayName("T_T")
    @RepeatedTest(9)
    void addTest() {
        int result = c.add(a, b);
        Assertions.assertEquals(result, a + b);
        a++;
        b++;
    }

}
