package unit_10;

public class MyArrayArg
{
    public void declare()
    {
        int a[] = {10,20,30,40,50};
        display(a);
    }
    
    public void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}