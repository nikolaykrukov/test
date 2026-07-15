package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {

    @ParameterizedTest(name = "№{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"10, 2, 12", "-5, 25, 20"})
    @DisplayName("Проверка суммирования")
    @Tag("param")
    void summ(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a,b);
        Assertions.assertEquals(expectedResult,result, "Не тот ответ");
    }

    @ParameterizedTest(name = "№{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"10, 3, 7", "17, 15, 2"})
    @DisplayName("Проверка вычитания")
    @Tag("param")
    void sub(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.sub(a,b);
        Assertions.assertEquals(expectedResult,result, "Не тот ответ");
    }
}