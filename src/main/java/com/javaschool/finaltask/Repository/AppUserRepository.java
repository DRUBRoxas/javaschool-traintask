package com.javaschool.finaltask.Repository;

import com.javaschool.finaltask.Entity.AppUser;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public interface AppUserRepository extends JpaRepository<AppUser, String> {
    //TODO
    // This repository is probably going to change when i create the security and login
    AppUser findByEmail(String email);

    List<AppUser> findByRole(String role);

    AppUser findOne(AppUser user);
}