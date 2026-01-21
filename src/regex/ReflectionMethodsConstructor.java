package regex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Demo {
    public Demo() {
        System.out.println("==In Constructor==");
    }

    int i = 10;
}

class Display extends Demo {
    int j = 10;

    void Deck() {
        System.out.println("In Deck Method");
    }
}

public class ReflectionMethodsConstructor {

    public static void main(String args[]) throws ClassNotFoundException {

        // Demo dm = new Demo(20);
        Display dis = new Display();

        Class classes;

        classes = dis.getClass();
        System.out.println(classes);
        System.out.println("Calling Its Super Class Name===>>"
                + classes.getSuperclass());


        Class cls = Class.forName("Chapter_27.Demo");


        Constructor[] constructors = cls.getDeclaredConstructors();
        // Loop through the constructor and print out their names
        for (Constructor constructor : constructors) {
            System.out.println("constructor name==>>>" + constructor.getName());
        }

        Method[] methods = classes.getDeclaredMethods();


        //	Method[] meth = classes.get

        // Loop through the methods and print out their names
        for (Method method : methods) {
            System.out.println("Method name==>>>" + method.getName());
        }
    }
}
