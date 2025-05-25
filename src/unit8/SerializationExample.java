/*Serialization
Write a Java program that serializes an instance of a Person class to a file "person.ser" and then deserializes it back to an object.*/

package unit8;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Person object serialized.");
        } catch (IOException e) {
            System.out.println("An error occurred during serialization.");
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
    }
}