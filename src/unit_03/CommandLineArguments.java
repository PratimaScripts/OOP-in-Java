package unit_03;

class CommandLineArguments {
    public static void main(String args[]) {

        for (int x = 0; x < args.length; x++)
            System.out.println("***Args are***" + args[x]);

    }
}