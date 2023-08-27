package OOPs;

public class GettersSetters 
{
    public static void main(String args[])
    {
        Pens p1 = new Pens();
        p1.setColor("blue");
        p1.setTip(2);
        //System.out.println(p1.color + " " + p1.tip);      
        //p1.color = "green";
        //p1.tip = 5;                                      also . operator can't e use anymore
        //System.out.println(p1.color + " " + p1.tip);     these will not work bacause the properties has benn private 

        //getters and setters
        System.out.println(p1.getColor() + " " + p1.getTip());
    }
}

class Pens
{
    private String color;
    private int tip;

    String getColor()
    {
        return this.color;
    }

    void setColor(String newcolor)
    {
        color = newcolor;
    }

    int getTip()
    {
        return this.tip;
    }

    void setTip(int tip)        //this is a external variable.
    {
        this.tip = tip;         // here on the LHS this. is referencing to the variable declared above.
                                // and RHS tip denotes the external variable tip declared in the parameters.
    }
}