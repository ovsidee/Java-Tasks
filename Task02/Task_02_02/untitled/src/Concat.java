public class Concat implements TwoStringsOper{

    @Override
    public String apply(String first, String second) {
        return first + second;
    }
}
