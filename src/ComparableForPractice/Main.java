package ComparableForPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static class cars {
        int price;
        String brand;
        int year;

        cars(int price, String brand, int year) {
            this.price = price;
            this.brand = brand;
            this.year = year;
        }

        @Override
        public String toString() {
            return price + "";
        }
    }

    public static void main(String[] args) {
        cars car1 = new cars(200, "Audi", 2020);
        cars car2 = new cars(500, "farai", 1520);
        cars car3 = new cars(1230, "Mahindra", 1996);
        cars car4 = new cars(7500, "Bolero", 1992);
        cars car5 = new cars(5485, "Marcedes", 1991);
        cars car6 = new cars(2300, "Fortuner", 1915);
        List<cars> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        list.add(car6);
        Collections.sort(list, new Comparator<cars>() {
            @Override
            public int compare(cars c1, cars c2) {
                return -c1.price + c2.price;
            }
        });
        System.out.println(list);


        Collections.sort(list, new Comparator<cars>() {
            @Override
            public int compare(cars c1, cars c2) {
                return c1.price - c2.price;
            }
        });
        System.out.println(list);
    }
}
