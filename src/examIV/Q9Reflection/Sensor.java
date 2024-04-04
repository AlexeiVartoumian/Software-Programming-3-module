package examIV.Q9Reflection;

import static java.lang.Thread.sleep;

public class Sensor {

    double value;



    public double read(){
        return value;
    }

    public double readTemperature() throws Exception{

        try {
            double value = read();
            if ( value == -300){
                throw  new Exception("oh no!");
            }
            return value;
        }catch ( Exception e){
            System.out.println("Sensor out of order");
            return Double.NaN;
        }
    }
    public void monitor(double low , double high) throws Exception {
        int count = 0;
        while (true){
            sleep(1000);
            double value = readTemperature();
            if(Double.isNaN(value)){
              count+=1;
              if (count >= 60){
                System.err.println("Sensor out of order long time! alert alert");
                break;
              }
            } else if (value < low || value > high) {
                System.err.println("Bad temp read");
                count = 0;
            }else{
                System.out.println("temp read" + " " + value);
                count = 0;
            }
        }
    }



}
