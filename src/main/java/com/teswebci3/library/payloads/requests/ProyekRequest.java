package com.teswebci3.library.payloads.requests;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.grammars.hql.HqlParser.LocalDateTimeContext;
import org.springframework.format.annotation.DateTimeFormat;

public class ProyekRequest {
    private String id;
    private String nama_proyek;
    private String client;
    private LocalDate tanggalMulai;
    private LocalDate tanggalSelesai;
    private String pimpinan_proyek;
    private String ket;

    public ProyekRequest() {

    }
    
    public ProyekRequest(String id, String nama_proyek, String client, LocalDate tanggalMulai, LocalDate tanggalSelesai, String pimpinan_proyek, String ket) {
        this.id = id;
        this.nama_proyek = nama_proyek;
        this.client = client;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.pimpinan_proyek = pimpinan_proyek;
        this.ket = ket;
    }
    
    //getter and setter
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
}

