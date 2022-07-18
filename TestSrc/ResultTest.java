import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void countingValleys() {
        int result = Result.countingValleys(8, "UDDDUDUU");
        assertEquals(1, result);

    }

    @Test
    void countingValley12Steps() {
        int result = Result.countingValleys(12, "DDUUDDUDUUUD");
        assertEquals(2, result);
    }

    @Test
    void countingValley10Steps() {
        int result = Result.countingValleys(10, "UDUUUDUDDD");
        assertEquals(0, result);
    }

    @Test
    void counting2Valleys() {
        int result = Result.countingValleys(10, "DUDDDUUDUU");
        System.out.println("Result" + result);

    }
}