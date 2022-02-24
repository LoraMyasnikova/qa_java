import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int kittensCount;
    private final int expectedResult;

    public FelineParameterizedTest(int kittensCount, int expectedResult) {
        this.kittensCount = kittensCount;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                {0, 0},
                {-10, -10},
                {1000, 1000}
        };
    }

    @Test
    public void getKittensWithParameterReturnsCorrectValue() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens(kittensCount);

        assertEquals(expectedResult, actualResult);
    }
}
