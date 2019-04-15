package md.springboot.repository;

import md.springboot.repository.entity.User;

import java.util.List;

public interface UserRepository {
    List<User> retrieve();
}
