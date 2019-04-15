package md.springboot.controller.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.business.UserBusiness;
import md.springboot.controller.UserController;
import md.springboot.repository.entity.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserBusiness business;

    @Override
    public List<User> retrieve() {
        return business.retrieve();
    }
}
