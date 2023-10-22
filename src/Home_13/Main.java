package Home_13;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2022, 10, 22);
        LocalDate localDate2 = LocalDate.of(2019, 07, 10);
        LocalDate localDate3 = LocalDate.of(2018, 05, 14);
        LocalDate localDate4 = LocalDate.of(2016, 11, 22);
        LocalDate localDate5 = LocalDate.of(2012, 12, 1);
        LocalDate localDate6 = LocalDate.of(2021, 02, 17);
        LocalDate localDate7 = LocalDate.of(2019, 8, 8);

        Product product1 = new Product("Toothbrush", 220, true, localDate1);
        Product product2 = new Product("Book", 75, false, LocalDate.now());
        Product product3 = new Product("Toothpaste", 330, true, localDate2);
        Product product4 = new Product("Car", 450, false, localDate3);
        Product product5 = new Product("Book", 170, true, localDate4);
        Product product6 = new Product("Folders", 450, true, localDate5);
        Product product7 = new Product("Book", 600, true, localDate6);
        Product product8 = new Product("Book", 567, true, localDate7);
        //Core List!
        List<Product> list1 = List.of(product1, product2, product3, product4, product5, product6, product7, product8);
        //task 1.2
        List<Product> listProduct = list1.stream()
                .filter(book -> book.getType().equals("Book"))
                .filter(book -> book.getPrice() >= 250).toList();

        listProduct.forEach(System.out::println);
        System.out.println("---------");
        //task 2.2
        List<Product> productDisc = list1.stream()
                .filter(book -> book.getType().equals("Book"))
                .filter(book -> book.getDiscount().equals(true))
                .map(book -> {
                    Product cloneProduct = new Product(book.getType(), book.getPrice(), book.getDiscount(), book.getLocalDate());
                    double price = cloneProduct.getPrice() * 0.9;
                    cloneProduct.setPrice((int) price);
                    return cloneProduct;
                }).toList();
        productDisc.forEach(System.out::println);
        System.out.println("--------");

        // 3.2
        Optional<Product> cheapest = list1.stream()
                .filter(book -> book.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice));

        if (cheapest.isPresent()) {
            System.out.println(cheapest.get());
        } else {
            throw new NoSuchElementException("Product from type : book doest find! ");
        }
        System.out.println("------");

        //task 4.2
        list1.stream()
                .sorted(Comparator.comparing(Product::getLocalDate).reversed())
                .limit(3)
                .forEach(System.out::println);
        System.out.println("------");

        //task 5.2
        int sum = list1.stream()
                .filter(book -> book.getLocalDate().getYear() == 2023)
                .filter(book -> book.getType().equals("Book"))
                .filter(book -> book.getPrice() <= 75)
                .map(Product::getPrice)
                .reduce(0, (book1, book2) -> book1 + book2);
        System.out.println(sum);
        System.out.println("------");


        //task 6.2
        Map<String, List<Product>> vocabulary = list1.stream()
                .collect(Collectors.groupingBy(Product::getType));
        System.out.println(vocabulary);
    }

}
