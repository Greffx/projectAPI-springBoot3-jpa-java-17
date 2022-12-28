package com.studyingByMyself.course.config;

import com.studyingByMyself.course.entities.Category;
import com.studyingByMyself.course.entities.Order;
import com.studyingByMyself.course.entities.Product;
import com.studyingByMyself.course.entities.User;
import com.studyingByMyself.course.entities.enums.OrderStatus;
import com.studyingByMyself.course.repository.CategoryRepository;
import com.studyingByMyself.course.repository.OrderRepository;
import com.studyingByMyself.course.repository.ProductRepository;
import com.studyingByMyself.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class ListOfPeopleAndThingsForTestsConfig {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Bean
    void listOfObjectsToTest() {

        User user1 = new User(null, "Maria", "maria@gmail.com", "5199999999", "1234");
        User user2 = new User(null, "Du", "du@gmail.com", "5111112944", "12345");
        User user3 = new User(null, "Edu", "edu@gmail.com", "5132198765", "12346");

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, user3);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, user1);
        Order order4 = new Order(null, Instant.parse("2022-12-22T18:21:22Z"), OrderStatus.SHIPPED, user1);

        Category category1 = new Category(null, "Electronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");

        Product product1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", new BigDecimal("90.5"), "");
        Product product2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", new BigDecimal("2190.0"), "");
        Product product3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", new BigDecimal("1250.0"), "");
        Product product4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", new BigDecimal("1200.0"), "");
        Product product5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", new BigDecimal("100.99"), "");

        userRepository.saveAll(Arrays.asList(user1, user2, user3));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3, order4));
        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));


        product1.getCategories().add(category2);
        product2.getCategories().add(category1);
        product2.getCategories().add(category3);
        product3.getCategories().add(category3);
        product4.getCategories().add(category3);
        product5.getCategories().add(category2);

        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

    }
}
