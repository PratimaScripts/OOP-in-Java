package unit3;

public class MyScope
{
    int x = 5;
    
    public void local()
    {
       int x = 10;
       System.out.println("The value of x in local method is: "+x);
    }
    
    public void global()
    {
        System.out.println("The value of x in global method is: "+x);
    }
}