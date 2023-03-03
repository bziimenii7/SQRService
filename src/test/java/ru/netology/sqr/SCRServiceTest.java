package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SCRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void sqrInRage(int expected, int x, int y) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(x , y);

        Assertions.assertEquals(expected, actual);
    }

}

