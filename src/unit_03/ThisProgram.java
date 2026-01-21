package unit_03;

class Point {
    public int x;
    public int y = 0;

    //constructor
    public Point(int x, int y) {
        x = x;
        this.y = y;
    }
}

class ThisProgram {
    public static void main(String args[]) {
        Point pt = new Point(12, 22);
        System.out.println(pt.x);
        System.out.println(pt.y);
    }

}
