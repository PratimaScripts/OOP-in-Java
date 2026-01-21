package CollectionsExample;


class CloneProgram {
    public static void main(String args[]) {
        String userCurrentlyLogedOn = System.getProperty("user.name");
        String usersCurrntWorkingDir = System.getProperty("user.dir");

        System.out.println("user name==" + userCurrentlyLogedOn);

        System.out.println("user current dir name==" + usersCurrntWorkingDir);

        System.out.println("System environment==" + System.getenv());

        String strArray[] = {"AA", "KK", "BB", "CC", "DD",};

        String a2[] = strArray.clone();

        System.out.println(a2.length);

        for (String elements : a2)

            System.out.println(elements);

    }
}