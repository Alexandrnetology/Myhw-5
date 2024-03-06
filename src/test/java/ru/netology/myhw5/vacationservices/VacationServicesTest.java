package ru.netology.myhw5.vacationservices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServicesTest {
    @ParameterizedTest
    @CsvSource({
            "10_000,3000,20_000",
            "100_000,60_000,150_000"
    })
    public void testVacationWork(int income, int expenses, int threshould) {
        VacationServices services = new VacationServices();

        int actual = services.calculate(income, expenses, threshould);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }
}
