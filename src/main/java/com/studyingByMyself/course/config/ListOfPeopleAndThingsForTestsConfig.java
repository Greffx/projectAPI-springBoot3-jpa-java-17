package com.studyingByMyself.course.config;

import com.studyingByMyself.course.entities.User;
import com.studyingByMyself.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class ListOfPeopleAndThingsForTestsConfig {

    @Autowired
    private UserRepository userRepository;

    @Bean
    void listOfUser() {

        User user = new User(null, "Maria", "maria@gmail.com", "5199999999", "1234");
        User user1 = new User(null, "Du", "du@gmail.com", "5111112944", "12345");
        User user2 = new User(null, "Edu", "edu@gmail.com", "5132198765", "12346");

        userRepository.saveAll(Arrays.asList(user1, user2, user));

    }
}
