package Worksheet8DesPatternBehaviour.state;

public class Main {
    public static void main(String[] args) {

        //as I understand whole point of state pattern is to not deal with a bunch of
        //if else clauses and abstract that into interfaces where a specific operation
        // belongs to that interface
        Robot robot = new Robot();
        robot.walk();
        robot.cook();
        robot.walk();
        robot.off();

        robot.walk();
        robot.off();
        robot.cook();

    }
}
