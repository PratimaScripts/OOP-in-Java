package unit_16;

class waitForProgram {
    public static void main(String args[]) {

        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {

            p = r.exec("calc");

            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "anil");
            proc.start();

            System.out.println(System.getProperty("user.dir"));
            //	p.waitFor();
        } catch (Exception e) {
            System.out.println("Error Executing notepad");
        }

    }
}