package GradeScope2023.DecoratorPat;

public class Main {
    public static void main(String[] args) {


        BaseCar baseCar = new BaseCar();

        TurboCar boost = new TurboCar(new NItroCar(baseCar));

        boost.ride();
    }
}
