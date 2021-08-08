import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void it_should_convert_to_Fizz_Buzz() {
        FizzBuzz thing = new FizzBuzz();
        List<String> actual = thing.fizzBuzz();
        List<String> expected = new ArrayList<>(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
        assertEquals(expected,  actual);
    }
}
