package examIV.Q9Reflection;

public class Main {
    public static void main(String[] args) {

        /*
        The fictitious company ShiverOrSweat develops temperature sensors for buildings. They have to build a class which can be used for reading the temperature. This company has just hired you, and you are now to design part of this class,  Sensor.

A method read has already been written, which returns a double indicating the temperature reading in Celsius.
         */
           /*
    For this example, why is it preferable to throw an exception against returning the value -300, which the calling method could check?

someone new looking at the code might not necessarily know that -300 is a out of order value
exceptions are meant for exactly this scenario

     */
    /*
    Write a method monitor which monitors the temperature. The method has two arguments, low and high.

public void monitor(double low, double high) {
    // YOUR CODE
  }
The method monitor should read the temperature every second and write a warning (to System.out.err) if the temperature is below low or above high. If there is no response from the sensor for one minute (the sensor returns -300 every time it is queried within that minute), the monitor method should write out a special warning (to System.out.err).

You may find the following method of assistance:

public static void sleep(long mills)
       throws InterrupedException
The sleep method is from the Thread class, and it will pause execution for mills milliseconds.
     */
    }
}
