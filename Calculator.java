public class Calculator {
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public double add(double a, double b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Calculator c1= new Calculator();
        System.out.println("First add: "+ c1.add(1,2));
        System.out.println("Second add: "+c1.add(1, 2, 3));
        System.out.println("Third add: "+ c1.add(10L, 20L));
    }
}
