package md.springboot.business.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.business.UserBusiness;
import md.springboot.repository.UserRepository;
import md.springboot.repository.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserBusinessImpl implements UserBusiness {

    private final UserRepository repository;

    @Override
    public List<User> retrieve() {
        return repository.retrieve();
    }
}
