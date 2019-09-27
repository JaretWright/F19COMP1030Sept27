public class Car
{
    //these are the private instance variables to define a Car object
    private String make, model, colour;
    private int modelYear, odometer;

    /**
     * This is a constructor for the Car class.  It is used to create a new
     * Car object and configure the instance variables
     */
    public Car(String manufacturer, String model, String colour, int year, int odometer)
    {
        this.make = manufacturer;
        this.model = model;         //using the keyword 'this' means we are referencing the
        this.colour = colour;       //the class level variable (not the arguments)
        this.modelYear = year;
        this.odometer = odometer;
    }
}
