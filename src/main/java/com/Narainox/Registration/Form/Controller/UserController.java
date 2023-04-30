package com.Narainox.Registration.Form.Controller;

import com.Narainox.Registration.Form.Entity.Users;
import com.Narainox.Registration.Form.Service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    public String register(@ModelAttribute Users users, HttpSession session)
    {
        userService.saveUser(users);
        return "redirect:/";
    }
}
