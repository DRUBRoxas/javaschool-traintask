package com.javaschool.finaltask.Domain.AppUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class AppUserController {

    private AppUserService appUserService;

    @GetMapping
    public List<AppUser> getAll() {
        return appUserService.findAll();
    }

    @GetMapping("/{id}")
    public AppUser getById(@PathVariable Long id) {
        return appUserService.findById(id);
    }

    @PostMapping
    public AppUser save(@RequestBody AppUser appUser) {
        appUserService.save(appUser);
        return appUser;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        appUserService.deleteById(id);
        return "Deleted user id - " + id;
    }
}
