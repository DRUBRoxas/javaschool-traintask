package com.javaschool.finaltask.Domain.Passenger;

import com.javaschool.finaltask.Domain.AppUser.AppUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "Passenger")
@Table(name = "passenger", schema = "finaltask")
public class Passenger {
    private String userEmail;

    private AppUser appUser;

    private String name;

    private String surname;

    private LocalDate dateBirth;

    private Byte isDelete;

    @Id
    @Column(name = "user_email", nullable = false)
    public String getUserEmail() {
        return userEmail;
    }

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_email", nullable = false)
    public AppUser getAppUser() {
        return appUser;
    }

    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    @Column(name = "surname", nullable = false, length = 80)
    public String getSurname() {
        return surname;
    }

    @Column(name = "date_birth", nullable = false)
    public LocalDate getDateBirth() {
        return dateBirth;
    }

    @Column(name = "isDelete")
    public Byte getIsDelete() {
        return isDelete;
    }

}