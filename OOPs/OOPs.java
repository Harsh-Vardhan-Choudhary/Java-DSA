package OOPs;

public class OOPs
{
    public static void main(String args[])
    {
        Pen p1 = new Pen();
        p1.setColor("blue");
        p1.setTip(2);
        System.out.println(p1.color + " " + p1.tip);
        p1.color = "green";
        p1.tip = 5;
        System.out.println(p1.color + " " + p1.tip); 
    }
}

class Pen
{
    String color;
    int tip;

    void setColor(String newcolor)
    {
        color = newcolor;
    }

    void setTip(int newtip)
    {
        tip = newtip;
    }
}