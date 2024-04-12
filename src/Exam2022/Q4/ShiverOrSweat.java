package Exam2022.Q4;


public class ShiverOrSweat {


    public double read(){

        double celsuis = (double) (Math.random() * 40);

        int chance = (int) (Math.random() * 10);

        return chance ==9 ? -300.00 : celsuis;
    }

    public double readTemperature() throws Exception {
        double temp = 0;
        try {
            temp = read();
            if (temp == -300.00) {
                throw new Exception("error occured");
            }
            System.out.println("temp is " + temp);

        } catch (Exception e) {
            e.printStackTrace();
            return -300.00;
        }
        return temp;
    }

    public void monitor(double low , double high) throws Exception {

        int count = 0;
        while (true){

            Thread.sleep(1000);
            count+=1;

            double value = readTemperature();
            if (value == -300 ){
                if (count ==60){
                    System.err.println("MAd problems");
                    count = 0;
                }
            }else{
                count = 0;

                if (value < low || value > high){
                    System.err.println("temperature is below low or above\n" +
                            "high.");
                }
                System.out.println("temp read " + value);
            }
        }
    }
}
