package unit10;

public class MyArrayInst
{
    public void display()
    {
        //declaration and instantiation of an array
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        
        //printing the contents of an array
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}