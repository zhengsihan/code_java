package org.minus.junit_prac.p1;

import org.junit.*;

/**
 * Created by zhengsihan, on 2019-11-12
 */
public class CalculatorTest {
    Calculator c = null;

    @Test
    public void testAdd() {
        System.out.println("@Test testAdd()");
        int result = c.add(1, 3);
        Assert.assertEquals(result, 1 + 3);
    }

    @Test
    public void testSub() {
        System.out.println("@Test testSub()");
        int result = c.sub(1, 3);
        Assert.assertEquals(result, 1 - 3);
    }

    @Before
    public void func1() {
        c = new Calculator();
        System.out.println("@Before");
    }

    @After
    public void func2() {
        System.out.println("@After");
    }

    @BeforeClass
    public static void func3() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void func4() {
        System.out.println("@AfterClass");
    }
}
