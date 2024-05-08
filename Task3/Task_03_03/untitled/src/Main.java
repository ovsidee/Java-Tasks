public class Main {
    public static void main(String[] args) {
        Parabola parabola = new Parabola(1, -1 , 5.0/4);
        double min1 = FunDD.xminim(parabola, 0 ,1);
        System.out.println(min1);

        FunDD parabola1 = new FunDD() {
            @Override
            public double fun(double x) {
                return Math.sqrt(Math.pow(x - 0.75, 2) + 1);
            }
        };
        double min2 = FunDD.xminim(parabola1, 0 ,2);
        System.out.println(min2);

        FunDD lambda = (x) -> x*x*(x-2);
        double min3 = FunDD.xminim(lambda, 0, 2);
        System.out.println(min3);
    }
}