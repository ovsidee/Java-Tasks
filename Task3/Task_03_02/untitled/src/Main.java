import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(arr));

        String[] a1 = Sfilter.filter(arr, new LenFilter(4));
        System.out.println(Arrays.toString(a1));

        String[] a2 = Sfilter.filter(arr, new Sfilter() {
            @Override
            public boolean test(String s) {
                if (s.charAt(0) >= 'A' && s.charAt(0) < 'D') {
                    return true;
                }
                return false;
            }
        });
        System.out.println(Arrays.toString(a2));

        String[] a3 = Sfilter.filter(arr, (s) -> {
            if (s.charAt(0) > 'H' && s.charAt(0) <= 'Z'){
                return true;
            }
            return false;
        });
        System.out.println(Arrays.toString(a3));
    }
}