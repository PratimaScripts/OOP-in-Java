package unit_16;


public class JavaVerHomePath {
    public static void main(String[] args) {
        System.out.println(System.getProperties().getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
