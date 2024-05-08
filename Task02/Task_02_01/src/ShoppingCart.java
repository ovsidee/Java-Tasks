public interface ShoppingCart {
    void addProduct(Product product);
    void removeProduct(Product product);
    double getTotalPrice();
}
