package ru.gosteva.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Простые демонстрационные тесты")
public class SimpleTest {

    @Disabled("JRASERVER-41589")
    @Test
    @DisplayName("Проверка работы метода methodEx()")
    void simpleTest() {
        String actual = methodEx();
        Assertions.assertEquals("1", actual, "error_message");
    }

    String methodEx() {
        return "1";
    }
}
