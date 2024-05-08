public class Main {
    public static void main(String[] args) {
        Reversible[] reversibles = new Reversible[]{
                new ReversibleString("Cat"),
                new ReversibleDouble(2),
                new ReversibleDouble(3),
                new ReversibleString("Dog"),
                new ReversibleString("Alice in the Wonderland"),
                new ReversibleDouble(10)
        };
        System.out.println("Original: ");
        for (Reversible revers : reversibles) {
            System.out.println(revers);
        }

        System.out.println("Reversed: ");
        for (Reversible revers : reversibles){
            System.out.println(revers.reverse());
        }
        System.out.println("Reversed again and modified: ");
        for (Reversible r : reversibles){
            System.out.println(r.reverseModified());
        }
    }
}