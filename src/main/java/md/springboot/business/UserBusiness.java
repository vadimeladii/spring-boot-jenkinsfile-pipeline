package md.springboot.business;

import md.springboot.repository.entity.User;

import java.util.List;

public interface UserBusiness {

    List<User> retrieve();
}
