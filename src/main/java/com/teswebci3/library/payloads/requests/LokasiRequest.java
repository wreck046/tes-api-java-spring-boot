package com.teswebci3.library.payloads.requests;


public class LokasiRequest {
    private String Id;
    private String nama_lokasi;
    private String negara;
    private String provinsi;
    private String kota;


    public LokasiRequest(){
        
    }

    public LokasiRequest(String Id, String nama_lokasi, String negara, String provinsi, String kota){
        this.Id = Id;
        this.nama_lokasi = nama_lokasi;
        this.negara = negara;
        this.provinsi = provinsi;
        this.kota = kota;
    }

    //getter dan setter
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
    public String getProvinsi() {
        return provinsi;
    }
    public void setProvinsi(String provinsi){
        this.provinsi = provinsi;
    }
    public String getKota(){
        return kota;
    }
    public void setKota(String kota){
        this.kota = kota;
    }
}
