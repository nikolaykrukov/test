package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {
//    @BeforeAll
//    public static void setUp(){
//        System.out.println("Before all");
//    }
//    @BeforeEach
//    public void setUpEach(){
//        System.out.println("Before each");
//    }
//    @AfterAll
//    public static void afterAll(){
//        System.out.println("After all");
//    }
//    @AfterEach
//    public void afterEach(){
//        System.out.println("After each");
//    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7,result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7,result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования 3")
    @Tag("param")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a,b);
        Assertions.assertEquals(expectedResult,result, "Не тот ответ");
    }
}