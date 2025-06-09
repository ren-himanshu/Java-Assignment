class vehicle
{
    String make;
    String model;
    int year;
    int maximumSpeed;
    public vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }
    public void drive()
    {
        System.out.println(make+" "+model+" Vehicle is driving");
    }
}

class Car extends vehicle
{
    public Car(String make, String model, int year, int maximumSpeed)
    {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make+" "+model+" Car is driving");
    }
}

class Bike extends vehicle
{
    public Bike(String make, String model, int year, int maximumSpeed)
    {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make+" "+model+" Bike is driving");
    }
}

public class session1_assignment1 {
    public static void main(String[] args) {
        vehicle obj= new Car("TATA", "NANO", 15, 50);
        obj.drive();

        obj= new Bike("TVS", "Popat", 20, 40);
        obj.drive();
    }
}
