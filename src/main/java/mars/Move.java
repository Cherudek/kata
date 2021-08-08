package mars;

public interface Move {
    Point move(Point start, Direction initialDirection, Commands direction);
}
