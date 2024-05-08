public class Main {
    public static void main(String[] args) {
        TwoStringsOper[] a = {
                new Concat(), new ConcatRev(),
                new Initials(), new Separ(" loves ")
        };
        for (TwoStringsOper op : a) {
            System.out.println(op.apply("Mary", "John"));
        }
    }
}