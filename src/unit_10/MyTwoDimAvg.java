package unit_10;

public class MyTwoDimAvg {
    int x = 0;

    public void display() {
        double avg = 0;
        int sum = 0;
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            avg = sum / 3.0;
            System.out.println(avg);
        }
    }

    public static void main(String[] args) {
        MyTwoDimAvg myTwoDimAvg = new MyTwoDimAvg();
        myTwoDimAvg.display();
    }
}
