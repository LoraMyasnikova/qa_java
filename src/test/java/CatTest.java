import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private final String meowSound = "Мяу";
    private final List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");

    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnsCorrectValue() {
        String expectedResult = meowSound;

        Cat cat = new Cat(feline);
        String actualResult = cat.getSound();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        List<String> expectedResult = predatorFood;

        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(expectedResult);
        List<String> actualResult = cat.getFood();

        assertEquals(expectedResult, actualResult);
    }
}