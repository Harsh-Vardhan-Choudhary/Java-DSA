package OOPs;

public class Constructors
{
    public static void main(String args[])
    {
        student s1 = new student("Harsh");
    }
}

class student
{
    String name;
    int roll;

    student(String name)
    {
        this.name = name;
    }
}