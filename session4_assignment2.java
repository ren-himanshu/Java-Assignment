import java.util.Scanner;
class Animal
{
    void makeSound()
    {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal
{
    void makeSound()
    {
        System.out.println("The cat meows.");
    }
}

public class session4_assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose from given options:");
        System.out.println("1. Dog.");
        System.out.println("2. Cat");
        int x=sc.nextInt();
        Animal a;
        switch (x)
        {
            case 1:
                a= new Dog();
                break;
            case 2:
                a= new Cat();
            default:
                System.out.println("Invalid entry.");
                a= new Animal();
                break;
        }
        a.makeSound();
    }
}
