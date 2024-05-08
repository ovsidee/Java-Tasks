public interface FunDD {
    double fun(double x);

    static double xminim (FunDD f, double a, double b){
        double min = f.fun(a);
        double minX = a;
        double step = 1e-5;
        for (double i = a; i <= b; i+=step) {
            double k = f.fun(i);
            if (k < min){
                min = k;
                minX = i;
            }
        }
        return minX;
    }
}

