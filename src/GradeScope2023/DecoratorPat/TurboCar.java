package GradeScope2023.DecoratorPat;

public class TurboCar extends CarDecorator {

    protected Car car;

    public TurboCar(Car car){
        super(car);

    }
    @Override
    public void ride(){
        super.ride();
        System.out.println("Firing all Cylinders!");
    }

}
