public class Book implements Product{
    private String title;
    private double price;

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }

    public String getName() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
