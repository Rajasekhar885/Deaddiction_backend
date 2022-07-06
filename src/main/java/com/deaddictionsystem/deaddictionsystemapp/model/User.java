package com.deaddictionsystem.deaddictionsystemapp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Setter
@Getter
@ToString
public class User {
    @Id
    @GeneratedValue(generator = "user_seq",strategy = GenerationType.AUTO )
    @SequenceGenerator(name="user_seq",sequenceName = "user_seq",initialValue = 100,allocationSize = 1)
    @Column(name = "userid")
    private Integer userId;

    @Column(name = "name_of_staff")
    private String nameOfStaff;


    @Enumerated(EnumType.STRING)
    private Role role;

    private String userName;
    private String email;
    private String password;

    public User() {
    }

    public User( String nameOfStaff, Role role, String userName, String email, String password) {
        this.nameOfStaff = nameOfStaff;
        this.role = role;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
}
