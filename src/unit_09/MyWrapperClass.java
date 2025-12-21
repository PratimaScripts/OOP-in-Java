package unit_09;

public class MyWrapperClass
{
    public static void main(String [] args)
    {
        int k = 100;
        String l = "12";
        int m = Integer.parseInt(l);
        int result = k+m;
        System.out.println(result);
        System.out.println("Result in string: "+Integer.toString(result));
        
    }
}
