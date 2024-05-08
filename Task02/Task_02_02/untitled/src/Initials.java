public class Initials implements TwoStringsOper{
    @Override
    public String apply(String first, String second) {
        return first.charAt(0)  + "" +  second.charAt(0);
    }
}
