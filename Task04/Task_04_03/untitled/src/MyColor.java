import java.util.Comparator;

public class MyColor extends java.awt.Color implements Comparable<MyColor> {
    public MyColor(int r, int g, int b) {
        super(r, g, b);
    }

    @Override
    public String toString() {
        return "(" + getRed() + ", " + getGreen() + ", " + getBlue() + ")";
    }

    @Override
    public int compareTo(MyColor o) {
        if (this.sum() > o.sum()) {
            return 1;
        } else if (this.sum() < o.sum()) {
            return -1;
        }
        return 0;
    }

    public int sum() {
        return getRed() + getGreen() + getBlue();
    }
}
