package com.Narainox.Registration.Form.Service;

import com.Narainox.Registration.Form.Entity.Users;
import com.Narainox.Registration.Form.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void saveUser(Users users)
    {
        userRepo.save(users);
    }
}
