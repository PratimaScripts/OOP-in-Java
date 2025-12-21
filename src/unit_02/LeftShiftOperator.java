package unit_02;
class LeftShiftOperator
{
public static void main(String args[])
{
byte a =64,b;
int i;

//i = a<<1; // multiplied by 2

//i = a<<2; // multiplied by 4

i = a<<3; // multiplied by 8

i = a<<4; // multiplied by 16

b =(byte) (a<<2);
System.out.println("orginal value of a : "+a);
System.out.println("i and b : "+i+"   "+b);

}




}