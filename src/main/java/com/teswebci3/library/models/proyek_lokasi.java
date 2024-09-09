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
    private String IdOther;

    @ManyToOne
    @JoinColumn(name = "Lokasi_id")
    private lokasi lokasi;

    @ManyToOne
    @JoinColumn(name = "proyek_id")
    private proyek proyek;

   // Getter dan Setter
   public String getIdOther() {
    return IdOther;
}

public void setIdOther(String idOther) {
    this.IdOther = idOther;
}

public lokasi getLokasi() {
    return lokasi;
}

public void setLokasi(lokasi lokasi) {
    this.lokasi = lokasi;
}

public proyek getProyek() {
    return proyek;
}

public void setProyek(proyek proyek) {
    this.proyek = proyek;
}
}
