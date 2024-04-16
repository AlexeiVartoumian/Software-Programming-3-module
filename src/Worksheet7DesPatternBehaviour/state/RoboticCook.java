package Worksheet7DesPatternBehaviour.state;

public class RoboticCook implements RoboticState {

    private Robot robot;
  public RoboticCook(Robot robot) {
    this.robot = robot;
  }

  @Override
  public void walk() {

      if (robot.getState().getClass() == this.getClass()) {
          robot.setRoboticState(robot.getRoboticOn());
          System.out.println("robot is walking from cooking state");
      }

  }

  @Override
  public void cook() {

        if(robot.getState().getClass() == this.getClass()){
            System.out.println("robots cooking now!");
        }
  }

  @Override
  public void off() {
      if (robot.getState()!= this){
          System.out.println("Turning off Robot!");
          robot.setRoboticOff( robot.getRoboticOff());

      }
  }
}
