package com.teswebci3.library.services.Proyek;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.teswebci3.library.models.proyek;
import com.teswebci3.library.payloads.requests.ProyekRequest;
import com.teswebci3.library.payloads.responses.Response;
import com.teswebci3.library.repositories.ProyekRepository;

@Service
public class ProyekServiceImpl implements ProyekService{
    @Autowired
    private ProyekRepository proyekRepository;
    
    @Override
    public Response addNamaProyek(ProyekRequest request){
        proyek proyek = new proyek();

        proyek.setNamaProyek(request.getNamaProyek());
        proyek.setClient(request.getClient());
        proyek.setTanggalMulai(request.getTanggalMulai());
        proyek.setTanggalSelesai(request.getTanggalSelesai());
        proyek.setPimpinanProyek(request.getPimpinanProyek());

        proyek = proyekRepository.save(proyek);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("Proyek Berhasil Dibuat");
        response.setData(proyek);

        return response;
    }
    @Override
    public Response getNamaProyeks(){
        List<proyek> proyeks = proyekRepository.findAll();
        
        Response response = new Response(HttpStatus.OK.value(), "success", proyeks);
        return response;
    }
    @Override
    public Response getNamaProyekById(String uuid){
        proyek proyek = proyekRepository.findById(uuid).orElseThrow(() -> {
            throw new NoSuchElementException("Proyek Tidak Ditemukan!");
        });

        return new Response(HttpStatus.OK.value(), "success", proyek);
    }

    @Override
    public Response updateNamaProyekById(String uuid, ProyekRequest request){
        proyek proyek = proyekRepository.findById(uuid).orElseThrow(() -> {
            throw new NoSuchElementException("proyek tidak ditemukan!");
        });
        proyek.setNamaProyek(request.getNamaProyek());
        proyek.setClient(request.getClient());
        proyek.setTanggalMulai(request.getTanggalMulai());
        proyek.setTanggalSelesai(request.getTanggalSelesai());
        proyek.setPimpinanProyek(request.getPimpinanProyek());

        proyek = proyekRepository.save(proyek);

        return new Response(HttpStatus.OK.value(), "berhasil edit proyek", proyek);
    }

    @Override
    public Response deleteNamaProyekById(String uuid){
        proyek proyek = proyekRepository.findById(uuid).orElseThrow(() -> {
            throw new NoSuchElementException("proyek tidak ditemukan!");
        });

        proyek.setIsDeleted(true);

        proyek = proyekRepository.save(proyek);
        return new Response(HttpStatus.OK.value(), "proyek berhasil dihapus", proyek);
    }
}
