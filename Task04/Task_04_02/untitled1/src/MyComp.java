import java.util.Comparator;

public class MyComp implements Comparator<Integer> {
    public static final int
            BY_VAL=0, BY_VAL_REV=1,
            BY_NUM_OF_DIVS=2, BY_SUM_OF_DIGS=3;
    int criteria;

    public MyComp(int criteria){
        this.criteria = criteria;
    }


    @Override
    public int compare(Integer o1, Integer o2) {
        switch (criteria){
           case BY_VAL -> {
               //  return o1.intValue() - o2.intValue();
                if (o1 > o2){
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                }
                return 0;
           }
           case BY_VAL_REV -> {
               if (o1 > o2){
                   return -1;
               } else if (o1 < o2) {
                   return 1;
               }
               return 0;
//                return o2.intValue() - o1.intValue();
            }
           case BY_NUM_OF_DIVS -> {
               if (countDivisors(o1) == countDivisors(o2)) {
                    return -1;
               } else {
                   return countDivisors(o1) - countDivisors(o2);
               }
           }
           case BY_SUM_OF_DIGS -> {
                if (sumOfDigits(o1) == sumOfDigits(o2)) {
                    return 1;
                } else {
                    return sumOfDigits(o1) - sumOfDigits(o2);
                }
            }
           default -> throw new IllegalArgumentException("Invalid criteria");
        }
    }
    public int countDivisors(Integer n){
        int divisors = 0;
        for (int i = 1; i <= n; i++) {
            if ( n % i == 0){
                divisors++;
            }
        }
        return divisors;
    }

    public int sumOfDigits(Integer n){
        if (n < 10) return n;
        int firstDigit = n % 10;
        int secondDigit = 0;
        while (n > 0){
            secondDigit = n % 10;
            n/=10;
        }
        return firstDigit + secondDigit;
    }
}
