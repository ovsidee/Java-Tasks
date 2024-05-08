public class ReversibleString implements Reversible {
    private String s;

    public ReversibleString(String s){
        this.s = s;
    }

    @Override
    public Reversible reverse() {
        String res = "";
        for (int i = s.length() - 1; i >=0 ; i--) {
            res += s.charAt(i);
        }
        this.s = res;
        return this;
    }

    @Override
    public Reversible reverseModified() {
        String res = "Text: ";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            res += s.charAt(i);
        }
        this.s = res;
        return this;
    }

    public String toString(){
        return s;
    }
}
