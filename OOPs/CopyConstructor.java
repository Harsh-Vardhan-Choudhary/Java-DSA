package OOPs;

public class CopyConstructor 
{
    public static void main(String args[])
    {
        student s1 = new student();
        s1.name = "harsh";
        s1.roll = 11;
        s1.password = "abcde";
        s1.marks[0] = 11;
        s1.marks[1] = 12;
        s1.marks[2] = 13;

        student s2 = new student(s1);       //copy constructor has been called and it forms s2 with same properties of s1
        s2.password = "xyz";

        s1.marks[2] = 100;                  //here we have updated s1 marks 

        for(int i=0; i<3; i++)
        {
            System.out.println(s2.marks[i]);
        }

        /*here s2 marks should not be updated 
        as the copy of properties has been done 
        before modifing the content/property 
        
        But s2.marks will also be updated, 
        this is because reference of array is copied rather then the array*/
    }
    
}

class student
{
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    //copy constructor
    student(student s1)
    {
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;

    }

    student()
    {
        System.out.println("---");
    }

    student(String name)
    {
        this.name = name;
    }

    student(int roll)
    {
        this.roll = roll;
    }
}