package GradeScope2023.DecoratorPat;

public class CarDecorator implements Car{

    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }
    @Override
    public void ride(){
        car.ride();
    }
}
