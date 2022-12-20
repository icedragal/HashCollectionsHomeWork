import multiply.Exercise;
import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.*;

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

        Car granta = new Car("Lada", "Granta", 1.7F, Car.TypeOfBody.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0F, Car.TypeOfBody.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0F, Car.TypeOfBody.SEDAN);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.7F, Car.TypeOfBody.SEDAN);

        Truck truck1 = new Truck("Урал-М", "55571-3121-80", 6.65F, Truck.LoadCapacity.N2);
        Truck truck2 = new Truck("Урал-М", "4320-3171-80", 6.65F, Truck.LoadCapacity.N2);
        Truck truck3 = new Truck("Урал", "6370 63704К-0111", 11.12F, Truck.LoadCapacity.N3);
        Truck truck4 = new Truck("Урал", "Next", 6.65F, Truck.LoadCapacity.N2);

        Bus bus1 = new Bus("ПАЗ", "3205", 10F, Bus.Сapacity.SMALL);
        Bus bus2 = new Bus("ЛиАЗ", "677", 10F, Bus.Сapacity.EXTRA_SMALL);
        Bus bus3 = new Bus("ЛиАЗ", "5292", 10F, Bus.Сapacity.LARGE);
        Bus bus4 = new Bus("ПАЗ", "3292", 10F, Bus.Сapacity.MEDIUM);
        DriverB kolya = new DriverB("Николай", true, 3);
        DriverC syoma = new DriverC("Семён", true, 7);
        DriverD evgen = new DriverD("Евгений", true, 5);

        Mechanic<Car> kolyaM = new Mechanic<Car>("Николай", "Николаев", "ООО Гонки");
        Mechanic<Truck> syomaM = new Mechanic<Truck>("Семён", "Семёнов", "ООО Заезды");
        Mechanic<Bus> evgenM = new Mechanic<Bus>("Евгений", "Евгеньев", "ООО Быстрый пит-стоп");

        Sponsor tinkoff = new Sponsor("Тинькофф", 1_000_000);
        Sponsor tinkoff1 = new Sponsor("Тинькофф", 1_000_000);
        Sponsor avia = new Sponsor("Авиасеилс", 1_500_000);

        List<Transport> transports = List.of(granta, truck1, bus1);
        granta.addDriver(kolya);
        granta.addMechanic(kolyaM);
        granta.addSponsor(avia);

        truck1.addDriver(syoma);
        truck1.addMechanic(syomaM);
        truck1.addSponsor(avia);

        bus1.addDriver(evgen);
        bus1.addMechanic(evgenM);
        bus1.addSponsor(tinkoff);
        bus1.addSponsor(avia);
        bus1.addSponsor(tinkoff1);

        printInfo(bus1);

        Set<Exercise> exercises = new HashSet<>();
        while (exercises.size() < 15){
            Exercise exercise = new Exercise(random.nextInt(8) +2, random.nextInt(8) +2);
            exercises.add(exercise);
        }
        System.out.println(exercises);
    }

    private static void printInfo(Transport transport) {

        System.out.println("Водители " + transport.getBrand() + " " + transport.getModel() + " " + transport.getDrivers());
        System.out.println("Механики " + transport.getBrand() + " " + transport.getModel() + " " + transport.getMechanics());
        System.out.println("Спонсоры " + transport.getBrand() + " " + transport.getModel() + " " + transport.getSponsors());
    }
}