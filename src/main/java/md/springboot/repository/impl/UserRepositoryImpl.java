package md.springboot.repository.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import md.springboot.repository.UserRepository;
import md.springboot.repository.entity.User;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> retrieve() {
        List<User> users = List.of();
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<User>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/users.json");
        try {
            users = mapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("Unable to read users: " + e.getMessage());
        }
        return users;
    }
}
