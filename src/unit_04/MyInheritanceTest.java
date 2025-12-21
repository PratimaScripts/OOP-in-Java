package unit_04;

public class MyInheritanceTest
{
    public void display()
    {
        MyInheritanceChild mObj = new MyInheritanceChild("Ram");
        mObj.addition(7,4);
        mObj.subtraction(7,4);
        mObj.multiplication(7,4);
    }
    
    public static void main(String [] args) {
    	MyInheritanceTest myInheritanceTest = new MyInheritanceTest();
    	myInheritanceTest.display();
    }
}
