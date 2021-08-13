package mars2;

public class RoverController implements Controller {

    String direction = "N";
    int x = 0;
    int y = 0;

    @Override
    public String move(String directions) {
        for (char c : directions.toCharArray()) {
            if (c == 'R') direction = rotateRight();
            if (c == 'L') direction = rotateLeft();
            if (c == 'F') moveForward();
            if (c == 'B') moveBackwards();
        }
        return x + ":" + y + ":" + direction;
    }

    private void moveForward() {
        if (direction.equals("N")) y += 1;
        if (direction.equals("E")) x += 1;
        if (direction.equals("S")) y -= 1;
        if (direction.equals("W")) x -= 1;
    }

    private void moveBackwards() {
        if (direction.equals("N")) y -= 1;
        if (direction.equals("E")) x -= 1;
        if (direction.equals("S")) x += 1;
        if (direction.equals("W")) x += 1;
    }

    public String rotateRight() {
        if (direction.equals("N")) return "E";
        if (direction.equals("E")) return "S";
        if (direction.equals("S")) return "W";
        return "N";
    }

    public String rotateLeft() {
        if (direction.equals("N")) return "W";
        if (direction.equals("W")) return "S";
        if (direction.equals("S")) return "E";
        return "N";
    }

}

