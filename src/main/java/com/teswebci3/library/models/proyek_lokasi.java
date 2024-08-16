package com.teswebci3.library.models;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class proyek_lokasi {
    @Id
    @GeneratedValue
    @UuidGenerator
    private String Id;

    @ManyToOne
    @JoinColumn(name = "Id")
    private lokasi lokasi;

    @ManyToOne
    @JoinColumn(name = "id")
    private proyek proyek;
}
