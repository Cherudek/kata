package manhattan;

public class ManhattanDistance {

    Point a;
    Point b;

    public ManhattanDistance(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    Integer calculateDistance(){
        return Point.manhattanDistance(a, b);
    }
}
