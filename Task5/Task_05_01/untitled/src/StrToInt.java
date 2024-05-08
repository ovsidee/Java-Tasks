public class StrToInt implements Transform<String,Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
