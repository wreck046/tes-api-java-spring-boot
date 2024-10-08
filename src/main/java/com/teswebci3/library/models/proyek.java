package com.teswebci3.library.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.UuidGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyek")
public class proyek {
    @Id
    @GeneratedValue
    @UuidGenerator
    private String id;

    @Column(length = 100)
    private String nama_proyek;

    @Column(length = 100)
    private String client;

    @DateTimeFormat
    private LocalDate tanggalMulai;
    
    @DateTimeFormat
    private LocalDate tanggalSelesai;

    @Column(length = 100)
    private String pimpinan_proyek;

    @Column(length = 100)
    private String ket;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    private boolean isDeleted = false;

    //constructor kosong
    public proyek(){
        
    }
    //constructor
    public proyek(String id, String nama_proyek, String client, LocalDate tanggalMulai, LocalDate tanggalSelesai, String pimpinan_proyek, LocalDateTime createdAt, boolean isDeleted){
        this.id = id;
        this.nama_proyek = nama_proyek;
        this.client = client;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.pimpinan_proyek = pimpinan_proyek;
        this.createdAt = createdAt;
        this.isDeleted = isDeleted;
    }

    //getter and setter per proyek entitas
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getNamaProyek(){
        return nama_proyek;
    }

    public void setNamaProyek(String nama_proyek){
        this.nama_proyek = nama_proyek;
    }

    public String getClient(){
        return client;
    }

    public void setClient(String client){
        this.client = client;
    }

    public LocalDate getTanggalMulai(){
        return tanggalMulai;
    }

    public void setTanggalMulai(LocalDate tanggalMulai){
        this.tanggalMulai = tanggalMulai;
    }

    public LocalDate getTanggalSelesai(){
        return tanggalSelesai;
    }

    public void setTanggalSelesai(LocalDate tanggalSelesai){
        this.tanggalSelesai = tanggalSelesai;
    }

    public String getPimpinanProyek(){
        return pimpinan_proyek;
    }

    public void setPimpinanProyek(String pimpinan_proyek){
        this.pimpinan_proyek = pimpinan_proyek;
    }

    public String getKet(){
        return ket;
    }

    public void setKet(String ket){
        this.ket = ket;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }
    public Boolean getIsDeleted() {
        return isDeleted;
      }
    
      public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
      }    
}