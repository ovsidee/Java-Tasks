public
        class Main
            implements ShoppingCart{

    private Product[] products = new Product[20];
    private int productCounter = 0;

    @Override
    public void addProduct(Product product) {
        products[productCounter] = product;
        productCounter++;
    }

    @Override
    public void removeProduct(Product product) {
        for (int i = 0; i < productCounter; i++) {
            if (products[i] == product) {
                products[i] = products[i + 1];
            }
        }
        productCounter--;
    }

    @Override
    public double getTotalPrice() {
        if (productCounter == 0) System.out.println("Cart is empty.");
        double totalPrice = 0;
        for (int i = 0; i < productCounter; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        Main store = new Main();

    //TODO: implement Book class
        Product book = new Book("The Catcher in the Rye", 10.99);
    //TODO: implement Clothing class
        Product shirt = new Clothing("Blue Shirt", 25.99);
    //TODO: implement Electronic class
        Product phone = new Electronics("iPhone 12", 999.99);

        store.addProduct(book);
        store.addProduct(shirt);
        store.addProduct(phone);

        System.out.println("Total price: " + store.getTotalPrice());

        store.removeProduct(shirt);

        System.out.println("Total price: " + store.getTotalPrice());
    }
}