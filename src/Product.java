import java.util.Objects;

public class Product {
    private String name;
    private double cost;
    private double count;

    public Product(String name, double cost, double count) {
        setName(name);
        setCost(cost);
        setCount(count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        } else {
            this.name = name;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        } else {
            this.cost = cost;
        }
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        } else {
            this.count = count;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
