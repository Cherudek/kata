import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public List<String> fizzBuzz() {
        return IntStream.range(1, 101)
                .mapToObj(this::convertToFizzBuzz)
                .collect(Collectors.toList());
    }

    String convertToFizzBuzz(Integer number) {
        if (number % 3 == 0 && number % 5 == 0 ) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
