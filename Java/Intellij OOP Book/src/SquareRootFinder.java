public class SquareRootFinder {
    double n;
    int iterate;

    public void setNumber(double number) {
        n = number;
        iterate = 7;
        if (n < 10)
            iterate++;
    }

    public double getRoot() {
        double x = n / 4;
        for (int i = 0; i < iterate; i++) {
            x = (x + (n / x)) / 2.0;
        }
        return x;
    }
}