package mars2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoverTest {

    Rover rover;
    RoverController controller;

    @BeforeEach
    void setUp() {
        controller = new RoverController();
        rover = new Rover(controller);
    }

    @Test
    void fromNorthStayNorthWhenCommandIsEmpty() {
        assertEquals("0:0:N", rover.execute(""));
    }

    @Test
    void fromNorthHeadEastWhenCommandIsRight() {
        assertEquals("0:0:E", rover.execute("R"));
    }

    @Test
    void fromEastHeadSouthWhenCommandIsRight() {
        String command = rover.execute("RR");
        assertEquals("0:0:S", command);
    }

    @Test
    void fromSouthHeadWestWhenCommandIsRight() {
        assertEquals("0:0:W", rover.execute("RRR"));
    }

    @Test
    void fromWestHeadNorthWhenCommandIsRight() {
        assertEquals("0:0:N", rover.execute("RRRR"));
    }

    @Test
    void fromNorthHeadWestWhenCommandIsLeft() {
        assertEquals("0:0:W", rover.execute("L"));
    }

    @Test
    void fromWestHeadSouthWhenCommandIsLeft() {
        assertEquals("0:0:S", rover.execute("LL"));
    }

    @Test
    void fromSouthHeadEastWhenCommandIsLeft() {
        assertEquals("0:0:E", rover.execute("LLL"));
    }

    @Test
    void fromWestHeadNorthWhenCommandIsLeft() {
        assertEquals("0:0:N", rover.execute("LLLL"));
    }

    @Test
    void fromNorthHeadNorthCommandIsForward() {
        assertEquals("0:1:N", rover.execute("F"));
    }


    @Test
    void fromNorthHeadBackWhenCommandIsBackward() {
        assertEquals("0:0:N", rover.execute("FB"));
    }

    @Test
    void fromNorthHeadForwardWhenCommandIsFF() {
        assertEquals("0:2:N", rover.execute("FF"));
    }

    @Test
    void fromNorthHeadForwardWhenCommandIsFFF() {
        assertEquals("0:3:N", rover.execute("FFF"));
    }

    @Test
    void fromNorthHeadNorthWhenCommandIsLLRR() {
        assertEquals("0:0:N", rover.execute("LLRR"));
    }

    @Test
    void fromNorthHeadNorthWhenCommandIsLLFRR() {
        assertEquals("0:-1:N", rover.execute("LLFRR"));
    }

    @Test
    void fromNorthHeadNorthWhenCommandIsLLFFFRR() {
        assertEquals("-1:-3:W", rover.execute("LLFFFRF"));
    }

}
