import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private final List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
    private final String felineFamily = "Кошачьи";
    private final int kittensCount = 1;

    @Test
    public void eatMeatReturnsCorrectValue() throws Exception {
        List<String> expectedResult = predatorFood;

        Feline feline = new Feline();
        List<String> actualResult = feline.eatMeat();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        String expectedResult = felineFamily;

        Feline feline = new Feline();
        String actualResult = feline.getFamily();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensReturnsCorrectValue() {
        int expectedResult = kittensCount;

        Feline feline = new Feline();
        int actualResult = feline.getKittens();

        assertEquals(expectedResult, actualResult);
    }
}
