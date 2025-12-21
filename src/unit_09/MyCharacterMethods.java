package unit_09;

public class MyCharacterMethods
{
    public static void main(String [] args)
    {
      System.out.println(Character.isLetter('b'));
      System.out.println(Character.isLetter('2'));
      System.out.println("********");
      System.out.println(Character.isDigit('b'));
      System.out.println(Character.isDigit('2'));
      System.out.println("********");
      System.out.println(Character.isWhitespace('b'));
      System.out.println(Character.isWhitespace(' '));
      System.out.println(Character.isWhitespace('\n'));
      System.out.println(Character.isWhitespace('\t'));
      System.out.println("********");
      System.out.println(Character.isUpperCase('b'));
      System.out.println(Character.isUpperCase('B'));
    }
}
