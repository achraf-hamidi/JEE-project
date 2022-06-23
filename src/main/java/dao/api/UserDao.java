package dao.api;

import dao.entities.User;

import java.util.List;

public interface UserDao {

    public boolean insert(User user);
    public List<User> getAllUser();
    public boolean delete(String userId);
    public boolean update(User user);
    public User getUserByEmail(String email);

}