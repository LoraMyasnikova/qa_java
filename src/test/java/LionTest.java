import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String maleSex = "Самец";
    private final List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
    private final String predatorAnimalKind = "Хищник";
    private final int oneKittenCount = 1;
    private final String invalidSex = "Самеец";
    private final String exceptionMessage = "Используйте допустимые значения пола животного - самец или самка";

    @Mock
    private Feline feline;

    @Test
    public void getFoodReturnsCorrectResult() throws Exception {
        List<String> expectedResult = predatorFood;

        Lion lion = new Lion(maleSex, feline);
        Mockito.when(feline.getFood(predatorAnimalKind)).thenReturn(expectedResult);
        List<String> actualResult = lion.getFood();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensReturns1() throws Exception {
        int expectedResult = oneKittenCount;

        Lion lion = new Lion(maleSex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();

        assertEquals(expectedResult, actualResult);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void invalidSexReturnsException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage(exceptionMessage);
        Lion lion = new Lion(invalidSex, feline);
    }
}