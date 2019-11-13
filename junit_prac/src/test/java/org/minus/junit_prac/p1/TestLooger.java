package org.minus.junit_prac.p1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by zhengsihan, on 2019-11-13
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface TestLooger {
    @BeforeAll
    default void beforeAllTests() {
        System.out.println("Log from interface TestLogger @BeforeAll");
    }
}
