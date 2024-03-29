package com.example.prepoject_3_1.dao;



import com.example.prepoject_3_1.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    User getUserById(int id);

    void saveUser(User newUser);

    void deleteUserById(int id);

    void updateUser(User updatableUser, int id);



}
