package com.apparallel.model;


import javax.persistence.*;

@Entity
public class ClothingItem {
    @Id
    @Column(name = "ci_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int ciId;

}
