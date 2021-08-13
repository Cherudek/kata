package mars2;

public class Rover {

    RoverController controller;

    public Rover(RoverController controller) {
        this.controller = controller;
    }

    public String execute(String command) {
        return controller.move(command);
    }

}


