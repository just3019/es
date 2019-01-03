package org.demon.es;

import org.demon.es.pojo.User;
import org.demon.es.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {

        System.out.println("1=====================");
        userRepository.findAll().forEach(a -> System.out.println(a.toString()));

        for (int i = 0; i < 500; i++) {
            User user = new User();
            user.id = i;
            user.name = "test" + i;
            user.age = i;
            userRepository.save(user);
        }

        Pageable pageable = PageRequest.of(0, 2, Sort.Direction.ASC, "id");

        System.out.println("2=====================");
        Page<User> users = userRepository.findAll(pageable);
        System.out.println(users.getTotalElements());
        System.out.println(users.getTotalPages());
        users.forEach(a -> System.out.println(a.toString()));
        System.out.println("3=====================");
        userRepository.findAll().forEach(a -> System.out.println(a.toString()));
    }


}

