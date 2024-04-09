package ExamPrac2021.q2;

public record Employee(int id , String name , double salary) {

    public double salaryIncrease(double number){
        return salary() + number;
    }

    public Employee findbyId(int id){

        if (id == id()){
            return this;
        }
        return null;
    }




}
