package GradeScope2023.DecoratorPat;

public class NItroCar extends CarDecorator{

    protected Car car;

    public NItroCar(Car car){
        super(car);
    }

    @Override
    public void ride(){
        super.ride();
        System.out.println("Nitrooo Powerup Boom!");
    }
}
