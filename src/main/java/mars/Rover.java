package mars;

public class Rover {

    private Point initialPoint;
    private Direction initialDirection;
    private Commands commands;

    public Rover(Point initialPoint, Direction initialDirection, Commands commands) {
        this.initialPoint = initialPoint;
        this.initialDirection = initialDirection;
        this.commands = commands;
    }

    public void collision(Point obstacle, Point rover) throws CollisionException {
        if (obstacle.equals(rover)) {
            throw new CollisionException("Collision with obstacle at: " + obstacle);
        }
    }

    public Point move(Point start, Direction initialDirection, Commands command) {
        switch (initialDirection) {
            case NORTH:
                return moveNorth(command);
            case SOUTH:
                return moveSouth(command);
            case EAST:
                return moveEast(command);
            case WEST:
                return moveWest(command);
            default:
                return new Point(start.getX(), start.getY());
        }
    }

    private Point moveNorth(Commands commands){
        int x;
        int y;
        switch (commands){
            case FORWARD:
                x = initialPoint.getX();
                y = initialPoint.getY() + 1;
                return new Point(x, y);
            case BACKWARD:
                x = initialPoint.getX();
                y = initialPoint.getY() - 1;
                return new Point(x, y);
            case RIGHT:
                x = initialPoint.getX() + 1;
                y = initialPoint.getY();
                return new Point(x, y);
            case LEFT:
                x = initialPoint.getX() - 1;
                y = initialPoint.getY();
                return new Point(x, y);
            default:
                return new Point(initialPoint.getX(), initialPoint.getY());
        }
    }

    private Point moveSouth(Commands commands){
        int x;
        int y;
        switch (commands){
            case FORWARD:
                x = initialPoint.getX();
                y = initialPoint.getY() - 1;
                return new Point(x, y);
            case BACKWARD:
                x = initialPoint.getX();
                y = initialPoint.getY() + 1;
                return new Point(x, y);
            case RIGHT:
                x = initialPoint.getX() - 1;
                y = initialPoint.getY();
                return new Point(x, y);
            case LEFT:
                x = initialPoint.getX() + 1;
                y = initialPoint.getY();
                return new Point(x, y);
            default:
                return new Point(initialPoint.getX(), initialPoint.getY());
        }
    }

    private Point moveEast(Commands commands){
        int x;
        int y;
        switch (commands){
            case FORWARD:
                x = initialPoint.getX() + 1;
                y = initialPoint.getY();
                return new Point(x, y);
            case BACKWARD:
                x = initialPoint.getX() -1;
                y = initialPoint.getY();
                return new Point(x, y);
            case RIGHT:
                x = initialPoint.getX();
                y = initialPoint.getY() - 1;
                return new Point(x, y);
            case LEFT:
                x = initialPoint.getX();
                y = initialPoint.getY() + 1;
                return new Point(x, y);
            default:
                return new Point(initialPoint.getX(), initialPoint.getY());
        }
    }

    private Point moveWest(Commands commands){
        int x;
        int y;
        switch (commands){
            case FORWARD:
                x = initialPoint.getX() - 1;
                y = initialPoint.getY();
                return new Point(x, y);
            case BACKWARD:
                x = initialPoint.getX() + 1;
                y = initialPoint.getY();
                return new Point(x, y);
            case RIGHT:
                x = initialPoint.getX();
                y = initialPoint.getY() + 1;
                return new Point(x, y);
            case LEFT:
                x = initialPoint.getX();
                y = initialPoint.getY() - 1;
                return new Point(x, y);
            default:
                return new Point(initialPoint.getX(), initialPoint.getY());
        }
    }
}
