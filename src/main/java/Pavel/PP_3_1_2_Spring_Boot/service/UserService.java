package Pavel.PP_3_1_2_Spring_Boot.service;


import Pavel.PP_3_1_2_Spring_Boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(long id);

    void editUser(User user);

    void deleteUser(long id);
}