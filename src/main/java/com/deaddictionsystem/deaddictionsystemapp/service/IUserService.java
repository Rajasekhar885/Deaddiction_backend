package com.deaddictionsystem.deaddictionsystemapp.service;

import com.deaddictionsystem.deaddictionsystemapp.exception.UserNotFoundException;
import com.deaddictionsystem.deaddictionsystemapp.model.User;

import java.util.List;

public interface IUserService {

    User addUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);

    List<User>getAllUsers();

    User getUserById(int userId) throws UserNotFoundException;

    User getUserByEmail(String email) throws UserNotFoundException;

}
