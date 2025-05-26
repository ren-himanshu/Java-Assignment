class car{
    String make;
    String model;
    short year;
    int price;

    public car(String make, String model, short year, int price)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public void display()
    {
        System.out.println("Car brand: "+make+" Car model: "+model+" Year: "+year+" Price "+price);
    }
}

public class Automobile {
    public static void main(String[] args) {
        car c1= new car("Maruti", "S", (short)2024, 100000);
        c1.display();
    }
}
