package com.studyingByMyself.course.config;

import com.studyingByMyself.course.entities.Order;
import com.studyingByMyself.course.entities.User;
import com.studyingByMyself.course.entities.enums.OrderStatus;
import com.studyingByMyself.course.repository.OrderRepository;
import com.studyingByMyself.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class ListOfPeopleAndThingsForTestsConfig {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Bean
    void listOfObjectsToTest() {

        User user1 = new User(null, "Maria", "maria@gmail.com", "5199999999", "1234");
        User user2 = new User(null, "Du", "du@gmail.com", "5111112944", "12345");
        User user3 = new User(null, "Edu", "edu@gmail.com", "5132198765", "12346");

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, user3);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, user1);
        Order order4 = new Order(null, Instant.parse("2022-12-22T18:21:22Z"), OrderStatus.SHIPPED, user1);

        userRepository.saveAll(Arrays.asList(user1, user2, user3));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3, order4));

    }
}
