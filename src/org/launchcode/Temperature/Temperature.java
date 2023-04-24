package org.launchcode.Temperature;

public class Temperature {

    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            //try catch block to handle the exception
            //we must handle every exception that is thrown
            //we want to try to throw the exception and if we catch the error
            //print the stack trace

            try {
                throw new TemperatureException("That temp is too low boi!");
            } catch (TemperatureException e) {
                e.printStackTrace();
            }

        }

        fahrenheit = aFahrenheit;
    }
}
