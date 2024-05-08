public class ConcatRev implements TwoStringsOper{
    @Override
    public String apply(String first, String second) {
        return second+first;
    }
}
