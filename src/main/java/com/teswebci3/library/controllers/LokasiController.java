package com.teswebci3.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teswebci3.library.payloads.requests.LokasiRequest;
import com.teswebci3.library.payloads.responses.Response;
import com.teswebci3.library.services.Lokasi.LokasiService;

@RestController
@RequestMapping("/lokasis")
public class LokasiController {
    @Autowired
    private LokasiService lokasiService;

    @PostMapping
    public ResponseEntity<?> addLokasi(@RequestBody LokasiRequest lokasiRequest){
        try {
            Response response = lokasiService.addNamaLokasi(lokasiRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    @GetMapping
    public ResponseEntity<?> getNamaLokasi(){
        try {
            Response response = lokasiService.getNamaLokasis();
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    @GetMapping("/{uuid}")
    public ResponseEntity<?> getNamaLokasiById(@PathVariable("uuid") String Id){
        try {
            Response response = lokasiService.getNamaLokasiById(Id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<?> updateNamaLokasiById(@PathVariable("uuid") String Id, @RequestBody LokasiRequest lokasiRequest){
        try {
            Response response = lokasiService.updateNamaLokasiById(Id, lokasiRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<?> deleteNamaLokasiById(@PathVariable("uuid") String Id){
        try {
            Response response = lokasiService.deleteNamaLokasiById(Id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
