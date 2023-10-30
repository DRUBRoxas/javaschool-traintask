package com.javaschool.finaltask.Domain.AppUser;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppUserService {
    public List<AppUser> findAll();
    public AppUser findById(Long id);
    public void save(AppUser customer);
    public void deleteById(Long id);
}
