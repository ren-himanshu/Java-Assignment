abstract class shape
{
    abstract public void getArea();
}

class Circle extends shape
{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        // TODO Auto-generated method stub
        System.out.println("Area of circle: "+(3.14*Math.pow(radius,2)));
    }    
}

class square extends shape
{
    int length;

    public square(int length) {
        this.length = length;
    }

    @Override
    public void getArea() {
        // TODO Auto-generated method stub
        System.out.println("Area of sqaure: "+(Math.pow(length, 2)));
    }    
}

class rectangle extends shape
{
    int length;
    int breadth;

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth= breadth;
    }

    @Override
    public void getArea() {
        // TODO Auto-generated method stub
        System.out.println("Area of rectangle: "+(length*breadth));
    }    
}

public class session1_assignment2 {
    public static void main(String[] args) {
        
    
    shape obj= new Circle(1);
    obj.getArea();    

    obj= new square(5);
    obj.getArea();

    obj= new rectangle(2,3);
    obj.getArea();
    }
}
