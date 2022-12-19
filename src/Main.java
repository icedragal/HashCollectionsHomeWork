import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("Банан", 110, 1);
        Product orange = new Product("Апельсин", 150, 5);
        Product apple = new Product("Яблоко", 50, 1);
        ProductList productList = new ProductList();
        productList.add(banana);
        productList.add(orange);
        productList.add(apple);

        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size()<20){
            numbers.add(random.nextInt(1001));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number % 2 == 1){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}