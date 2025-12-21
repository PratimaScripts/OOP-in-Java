package unit_02;

import static java.lang.System.out;
class ForEachLoop

{
public static void main(String args[])
{
int intArray[] = {1,2,3,4,5,6,7,8,9,10};
int fact = 1;

for(int intList:intArray)
{
fact = fact * intList;	
 out.println(intList + "! = " + fact);
}
}
}
