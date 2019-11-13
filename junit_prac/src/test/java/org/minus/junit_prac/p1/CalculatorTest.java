package org.minus.junit_prac.p1;

import org.junit.jupiter.api.*;
import org.springframework.test.context.junit.jupiter.EnabledIf;

/**
 * Created by zhengsihan, on 2019-11-12
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("My Test ^_^")
class CalculatorTest implements TestLooger{

    private Calculator c = null;
    private boolean flag = false;

    @Test
    @Order(1)
    @DisplayName("if测试")
    @EnabledIf("true") //只能true/false，不能引用外部变量吗？
    void func5() {
        System.out.println("@EnabledIf");
    }

    @Test
    @DisplayName("加法测试")
    @Disabled
    void add() {
        System.out.println("@Test testAdd()");
        int result = c.add(1, 3);
        Assertions.assertEquals(result, 1 + 3);
    }

    @Test
    @DisplayName("减法测试")
    @Order(2)
    void sub() {
        System.out.println("@Test testSub()");
        int result = c.sub(1, 3);
        Assertions.assertEquals(result, 1 + 3);
    }

    @BeforeEach
    void func1() {
        c = new Calculator();
        System.out.println("@Before");
    }

    @AfterEach
    void func2() {
        System.out.println("@After");
    }

    @BeforeAll
    static void func3() {
        System.out.println("@BeforeClass");
    }

    @AfterAll
    static void func4() {
        System.out.println("@AfterClass");
    }
}