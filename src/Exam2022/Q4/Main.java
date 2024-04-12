package Exam2022.Q4;

public class Main {

    public static void main(String[] args) throws Exception {
        /*
        The fictitious company ShiverOrSweat develops temperature sensors for buildings. They have to develop a class that can be used for reading the temperature.
You have just been hired by this company, and you are now to design part of
this class, Sensor.
A method read has already been written which returns a double indicating the
temperature reading in celsius.
public double read() {...}
If the connection to the physical sensor is out of order read returns -300 although
this happens quite rarely.
(a) Implement a method readTemperature which calls the read method. You 4 marks
should throw an exception when the read method returns a value of -300.
public double readTemperature() throws Exception {
// YOUR CODE
}
(b) For this example, why is it preferable to throw an exception against return- 3 marks
ing the value -300 which the calling method could check?

 -> it allows the programmer to gracefully handle the case when the Tempereature is not working.
(c) Write a method monitor which monitors the temperature. The method has 8 marks
two arguments, low and high.
public void monitor(double low, double high) {
// YOUR CODE
}
The metd monitor should read the temperature every second, and write
out a whoarning (to System.err) if the temperature is below low or above
high.
If there is no response from the sensor for one minute (the sensor returns
-300 every time it is queried within that minute), the monitor method
should write out a special warning (to System.err).
You may find the following method of assistance:
public static void sleep(long mills) throws InterrupedException
sleep is from the Thread class and it will pause execution for mills milliseconds.
         */
        ShiverOrSweat thing = new ShiverOrSweat();
        for (int i = 0; i <10 ; i++) {
            thing.readTemperature();
        }

        thing.monitor(1,20);
    }
}
