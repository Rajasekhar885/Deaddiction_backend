package com.deaddictionsystem.deaddictionsystemapp.service;

import com.deaddictionsystem.deaddictionsystemapp.exception.UserNotFoundException;
import com.deaddictionsystem.deaddictionsystemapp.model.User;
import com.deaddictionsystem.deaddictionsystemapp.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService{

    private IUserRepository userRepository;

    @Autowired
    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
         userRepository.save(user);

    }

    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int userId) throws UserNotFoundException {
        return userRepository.findById(userId).orElseThrow(() -> {
            throw new UserNotFoundException();
        });
    }

    @Override
    public User getUserByEmail(String email) throws UserNotFoundException {
        User user = userRepository.findUserByEmail(email);
        if(user==null)
            throw new UserNotFoundException("No user found with email"+email);
        return user;
    }
}
