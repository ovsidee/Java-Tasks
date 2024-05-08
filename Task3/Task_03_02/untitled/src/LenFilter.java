public class LenFilter implements Sfilter{
    private int minLen;

    public LenFilter(int minLen) {
        this.minLen = minLen;
    }

    @Override
    public boolean test(String s) {
        if (s.length() >= minLen){
            return true;
        } else{
            return false;
        }
    }
}
