package unit10;

public class MyTwoArray
{
    public void display()
    {
        //Declaring a 2D array 
        int [][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
    
    public static void main(String [] args) {
    	MyTwoArray myTwoArray = new MyTwoArray();
    	myTwoArray.display();
    }
}