package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.User;
import com.studyingByMyself.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User insert(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(Integer id, User user) {
        User entityMonitored = userRepository.getReferenceById(id);
        updateToANewUser(entityMonitored, user);
        return userRepository.save(entityMonitored);
    }

    private void updateToANewUser(User entityMonitored, User updatedUser) {
        entityMonitored.setName(updatedUser.getName());
        entityMonitored.setEmail(updatedUser.getEmail());
        entityMonitored.setPhone(updatedUser.getPhone());
    }

}
