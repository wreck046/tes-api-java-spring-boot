package com.teswebci3.library.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.beans.propertyeditors.CharArrayPropertyEditor;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lokasi")
public class lokasi {
    @Id
    @GeneratedValue
    @UuidGenerator
    private String Id;

    @Column(length = 100)
    private String nama_lokasi;

    @Column(length = 100)
    private String negara;

    @Column(length = 100)
    private String provinsi;

    @Column(length = 100)
    private String kota;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private boolean isDeleted = false;
    //constructor
    public lokasi(String Id, String nama_lokasi, String negara, String provinsi, String kota, LocalDateTime createdAt, boolean isDeleted){
        this.Id = Id;
        this.nama_lokasi = nama_lokasi;
        this.negara = negara;
        this.provinsi = provinsi;
        this.kota = kota;
        this.createdAt = createdAt;
        this.isDeleted = isDeleted;
    }

    //getter and setter untuk entitas lokasi
    public String getId(){
        return Id;
    }

    public void setId(String Id){
        this.Id = Id;
    }

    public String getNamaLokasi(){
        return nama_lokasi;
    }

    public void setNamaLokasi(String nama_lokasi){
        this.nama_lokasi = nama_lokasi;
    }

    public String getNegara(){
        return negara;
    }

    public void setNegara(String negara){
        this.negara = negara;
    }

    public String getProvinsi(){
        return provinsi;
    }

    public void setProvinsi(String provinsi){
        this.provinsi = provinsi;
    }

    public String getkota(){
        return kota;
    }

    public void setKota(String kota){
        this.kota = kota;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    public boolean getIsDeleted(){
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted){
        this.isDeleted = isDeleted;
    }
}
