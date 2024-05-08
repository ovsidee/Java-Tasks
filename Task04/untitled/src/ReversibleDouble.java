public class ReversibleDouble implements Reversible{
    private double num;
    public ReversibleDouble(int num){
        this.num = num;
    }

    @Override
    public Reversible reverse() {
        double res = 1 / num;
        this.num = res;
        return this;
    }

    @Override
    public Reversible reverseModified() {
        double res = (1 / num) + 10;
        this.num = res;
        return this;
    }

    public String toString(){
        return Double.toString(num);
    }
}