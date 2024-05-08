public class Separ implements TwoStringsOper{
    String separator;

    public Separ(String separator){
        this.separator = separator;
    }

    @Override
    public String apply(String first, String second) {
        return first + separator + second;
    }
}
