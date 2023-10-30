package com.javaschool.finaltask.Domain.AppUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, String> {
    //TODO
    // This repository is probably going to change when i create the security and login
    AppUser findByEmail(String email);

    List<AppUser> findByRole(String role);

    AppUser findOne(AppUser user);

}