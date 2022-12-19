public class Main {
    public static void main(String[] args) {
        Product banana = new Product("Банан", 110, 1);
        Product orange = new Product("Апельсин", 150, 5);
        Product apple = new Product("Яблоко", 50, 1);
        ProductList productList = new ProductList();
        productList.add(banana);
        productList.add(orange);
        productList.add(apple);
    }
}