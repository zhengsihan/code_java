package org.minus.junit_prac.p1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

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

    /**
     * 单个参数
     * @param x
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("singleParam")
    void func1(int x) {
        int result = c.add(x, b);
        Assertions.assertEquals(result, x + b);
    }

    /**
     * 多个参数
     * @param x
     */
    @ParameterizedTest
    @MethodSource("multiParam")
    @DisplayName("MultiParam")
    void func1(int x, int y) {
        System.out.println(String.format("x=%d,y=%d", x, y));
        int result = c.add(x, y);
        Assertions.assertEquals(result, x + y);
    }

    static Stream<Arguments> multiParam() {
        return Stream.of(
                Arguments.of(1, 3),//根据入参个数，第一组注入 x=1, y=3
                Arguments.of(2, 4),//每个Arguments为一组
                Arguments.of(3, 5)
        );
    }

}
