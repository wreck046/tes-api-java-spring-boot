package com.teswebci3.library.services.Lokasi;

import java.util.List;
import java.util.NoSuchElementException;

import org.hibernate.annotations.DialectOverride.OverridesAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.teswebci3.library.models.lokasi;
import com.teswebci3.library.payloads.requests.LokasiRequest;
import com.teswebci3.library.payloads.responses.Response;
import com.teswebci3.library.repositories.LokasiRepository;

@Service
public class LokasiServiceImpl implements LokasiService{
    @Autowired
    private LokasiRepository lokasiRepository;

    @Override
    public Response addNamaLokasi(LokasiRequest request){
        lokasi lokasis = new lokasi(null, null, null, null, null, null, false);

        lokasis.setNamaLokasi(request.getNamaLokasi());
        lokasis.setNegara(request.getNegara());
        lokasis.setProvinsi(request.getProvinsi());
        lokasis.setKota(request.getKota());

        lokasis = lokasiRepository.save(lokasis);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("Lokasi Sukses Dibuat");
        response.setData(lokasis);

        return response;
    }
    @Override
    public Response getNamaLokasis(){
        List<lokasi> lokasis = lokasiRepository.findAll();
        Response response = new Response(HttpStatus.OK.value(), "success", lokasis);
        return response;
    }
    @Override
    public Response getNamaLokasiById(String uuid){
        lokasi lokasi = lokasiRepository.findById(uuid).orElseThrow(() -> {
            throw new NoSuchElementException("Lokasi Tidak Ditemukan!");
        });

        return new Response(HttpStatus.OK.value(), "success", lokasi);
    }
    @Override
    public Response updateNamaLokasiById(String uuid, LokasiRequest request){
        lokasi lokasi = lokasiRepository.findById(uuid).orElseThrow(() -> {
            throw new NoSuchElementException("Lokasi Tidak Ditemukan!");
        });
        
        lokasi.setNamaLokasi(request.getNamaLokasi());
        lokasi.setNegara(request.getNegara());
        lokasi.setProvinsi(request.getProvinsi());
        lokasi.setKota(request.getKota());
        
        lokasi = lokasiRepository.save(lokasi);

        return new Response(HttpStatus.OK.value(), "Lokasi berhasil diupdate", lokasi);
    }
    @Override
    public Response deleteNamaLokasiById(String uuid){
        lokasi lokasi = lokasiRepository.findById(uuid).orElseThrow(() -> {
            throw new NoSuchElementException("Lokasi Tidak Ditemukan!");
        });

        lokasi.setIsDeleted(true);
        lokasi = lokasiRepository.save(lokasi);
        return new Response(HttpStatus.OK.value(), "Lokasi Telah dihapus", lokasi);
    }
}
