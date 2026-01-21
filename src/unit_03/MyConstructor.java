package unit_03;

public class MyConstructor {
    String myName;
    String myColor;

    public MyConstructor() {
        System.out.println("Inside the constructor!!");
    }

    public MyConstructor(String name, String color) {
        myName = name;
        myColor = color;
        System.out.println("Name is : " + myName);
        System.out.println("Color is : " + myColor);
        //System.out.println("Inside the constructor!!");
    }
}
