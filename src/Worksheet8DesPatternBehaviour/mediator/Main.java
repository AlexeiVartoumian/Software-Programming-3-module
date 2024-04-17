package Worksheet8DesPatternBehaviour.mediator;

public class Main {
    public static void main(String[] args) {

        /**
         * Mediator pattern  -the point of wanting to use
         * this is when many objects require the usage of some  other objects and instead
         * of having business logic specific code tied to each of these classes relative
         * to the consumers , mediators/ agents are used as a go between/interface who are responsible for
         * implmenting the way they want to use those classes. this is to prevent tight
         * coupling and improve flexibility.
         */
        MachineMediator mediator = null;
        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Motor motor = new Motor();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();
        Button button = new Button();

        mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();

        System.out.println("**********************************************************");

        mediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();
    }
}
