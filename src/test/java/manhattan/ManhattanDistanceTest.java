package manhattan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManhattanDistanceTest {

    Point a;
    Point b;

    @BeforeEach
    void setUp() {
        a = new Point(8, 12);
        b = new Point(6, 10);
    }

    @Test
    void calculateDistanceTest() {
        Point SUT = new Point();
        Assertions.assertEquals(4, SUT.manhattanDistance(a, b));
    }

    @Test
    void calculateManhattanDistanceTest() {
        ManhattanDistance SUT = new ManhattanDistance(a, b);
        Assertions.assertEquals(4, SUT.calculateDistance());
    }
}
