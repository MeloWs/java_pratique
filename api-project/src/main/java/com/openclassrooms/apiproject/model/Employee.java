package com.openclassrooms.apiproject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employee {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  @Column(name="first_name")
    private String firstName;

  @Column(name="last_name")
    private String lastName;

  // pas besoin de mettre le nom des champs mail et paswd car ils sont identiques aux colonnes de la bdd
  private String mail;
  private String password;
}
