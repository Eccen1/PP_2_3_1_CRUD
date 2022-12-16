package crud.dao;

import crud.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {

    List<User> getUserList();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User user, int id);

    void deleteUser(int id);
}
