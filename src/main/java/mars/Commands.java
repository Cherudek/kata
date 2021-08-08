package mars;

public enum Commands {

    FORWARD(1),
    BACKWARD(-1),
    LEFT(-1),
    RIGHT(1);

    private int value;

    private Commands(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
