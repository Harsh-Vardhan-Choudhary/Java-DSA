package OOPs;
public class AccessModifiers
{
    public static void main(String args[])
    {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "harshvardhan";
        //myAcc.password = "123456";        this will get error as it is private
        myAcc.setpass("353463");
        /*we cannot get output of password as it is specified private 
        but we can change it because we have created function in itelf*/


    }
}

class BankAccount{
    public String username;
    private String password;

    public void setpass(String pwd){
        password = pwd;
    }
}