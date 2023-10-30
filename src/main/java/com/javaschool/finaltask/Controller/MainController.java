package com.javaschool.finaltask.Controller;

import com.javaschool.finaltask.Domain.AppUser.AppUser;
import com.javaschool.finaltask.Domain.AppUser.AppUserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
    private AppUserRepository userRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String email
            , @RequestParam String passw, @RequestParam String role) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        AppUser n = new AppUser();
        n.setEmail(email);
        n.setPassword(passw);
        n.setRole(role);
        userRepository.save(n);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<AppUser> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
}


