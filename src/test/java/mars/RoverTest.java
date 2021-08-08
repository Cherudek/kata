package mars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoverTest {
    Point initialPoint;
    Direction north;
    Commands forward;
    Rover SUT;

    @BeforeEach
    void setUp() {
        initialPoint = new Point(0, 0);
        SUT = new Rover(initialPoint, north, forward);
    }

    @Test
    void setNorthMovesForward() {
        Point newPoint = new Point(0, 1);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.NORTH, Commands.FORWARD));
    }

    @Test
    void setNorthMovesBackwards() {
        Point newPoint = new Point(0, -1);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.NORTH, Commands.BACKWARD));
    }

    @Test
    void setNorthMovesRight() {
        Point newPoint = new Point(1, 0);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.NORTH, Commands.RIGHT));
    }

    @Test
    void setNorthMovesLeft() {
        Point newPoint = new Point(-1, 0);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.NORTH, Commands.LEFT));
    }

    @Test
    void setSouthMovesForward() {
        Point newPoint = new Point(0, -1);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.SOUTH, Commands.FORWARD));
    }

    @Test
    void setSouthMovesBackwards() {
        Point newPoint = new Point(0, 1);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.SOUTH, Commands.BACKWARD));
    }

    @Test
    void setSouthMovesLeft() {
        Point newPoint = new Point(1, 0);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.SOUTH, Commands.LEFT));
    }

    @Test
    void setSouthMovesRight() {
        Point newPoint = new Point(-1, 0);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.SOUTH, Commands.RIGHT));
    }

    @Test
    void setEastMovesForward() {
        Point newPoint = new Point(1, 0);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.EAST, Commands.FORWARD));
    }

    @Test
    void setEastMovesBackward() {
        Point newPoint = new Point(-1, 0);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.EAST, Commands.BACKWARD));
    }

    @Test
    void setEastMovesLeft() {
        Point newPoint = new Point(0, 1);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.EAST, Commands.LEFT));
    }

    @Test
    void setEastMovesRight() {
        Point newPoint = new Point(0, -1);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.EAST, Commands.RIGHT));
    }

    @Test
    void setWestMovesForward() {
        Point newPoint = new Point(-1, 0);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.WEST, Commands.FORWARD));
    }

    @Test
    void setWestMovesBackward() {
        Point newPoint = new Point(1, 0);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.WEST, Commands.BACKWARD));
    }

    @Test
    void setWestMovesLeft() {
        Point newPoint = new Point(0, -1);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.WEST, Commands.LEFT));
    }

    @Test
    void setWestMovesRight() {
        Point newPoint = new Point(0, 1);
        Assertions.assertEquals(newPoint, SUT.move(initialPoint, Direction.WEST, Commands.RIGHT));
    }

    @Test
    void whenRoverHitsObstacleThrowsCollisionException() {
        Point obstacle = new Point(1, 1);
        Point rover = new Point(1, 1);
        Assertions.assertThrows(CollisionException.class, () -> {
            SUT.collision(obstacle, rover);
        });
    }
}