package OOPs;

public class Abstraction
{
    public static void main(String args[])
    {
        Horse H = new Horse();
        H.eat();
        H.walk();
        System.out.println(H.colour);
        H.changecolour();
        System.out.println(H.colour);
    }
}

abstract class animal
{
    String colour;

    animal()        //constructor
    {
        colour = "brown";
    }

    void eat()
    {
        System.out.println("animal eats");
    }

    abstract void walk();

}

class Horse extends animal
{
    void changecolour()
    {
        colour = "Dark brown";
    }

    void walk()
    {
        System.out.println("Walks on four legs");
    }
}

class chicken extends animal
{
    void changecolour()
    {
        colour = "orange";
    }

    void walk()
    {
        System.out.println("Walks on two legs");
    }
}