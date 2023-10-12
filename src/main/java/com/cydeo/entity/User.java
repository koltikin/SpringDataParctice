package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Users extends BaseEntity{

    private Setter firstName;
    private Setter lastName;
    private Setter email;
    private Setter passWord;
    @ManyToOne
    private Role role;
}
