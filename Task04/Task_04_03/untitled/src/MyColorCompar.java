import java.util.Comparator;

public class MyColorCompar implements Comparator<MyColor> {
    ColComponent color;

    public MyColorCompar(ColComponent color) {
        this.color = color;
    }

    public int compare(MyColor o1, MyColor o2){
        switch (color){
            case RED -> {
                if (o1.getRed() > o2.getRed()) return 1;
                else if (o1.getRed() < o2.getRed()) return -1;
                else return 0;
            }
            case GREEN -> {
                if (o1.getGreen() > o2.getGreen()) return 1;
                else if (o1.getGreen() < o2.getGreen()) return -1;
                else return 0;
            }
            case BLUE -> {
                if (o1.getBlue() > o2.getBlue()) return 1;
                else if (o1.getBlue() < o2.getBlue()) return -1;
                else return 0;
            }
        }
        return 0;
    }
}
