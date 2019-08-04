import javax.lang.model.util.ElementScanner6;

class Darts {
private final double distance;

    Darts(double x, double y) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        distance=Math.sqrt(x*x+y*y);
    }

    int score() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (distance<=1)
            return 10;
        else if (distance <=5)
            return 5;
        else if (distance <=10)
            return 1;
        return 0;
    }

}
