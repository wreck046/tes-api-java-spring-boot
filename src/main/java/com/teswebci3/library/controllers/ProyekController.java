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

import com.teswebci3.library.payloads.requests.ProyekRequest;
import com.teswebci3.library.payloads.responses.Response;
import com.teswebci3.library.services.Proyek.ProyekService;

@RestController
@RequestMapping("/proyeks")
public class ProyekController {
    @Autowired
    private ProyekService proyekService;

    @PostMapping
    public ResponseEntity<?> addProyek(@RequestBody ProyekRequest proyekRequest){
        try{
            Response response = proyekService.addNamaProyek(proyekRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        }catch(Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    @GetMapping
    public ResponseEntity<?>getNamaProyeks(){
        try{
            Response response = proyekService.getNamaProyeks();
            return ResponseEntity.status(response.getStatus()).body(response);
        }catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    @GetMapping("/{uuid}")
    public ResponseEntity<?> getNamaProyekById(@PathVariable("uuid") String id){
        try{
            Response response = proyekService.getNamaProyekById(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        }catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    @PutMapping("/{uuid}")
    public ResponseEntity<?> updateNamaProyekById(@PathVariable("uuid") String id, @RequestBody ProyekRequest proyekRequest){
        try{
            Response response = proyekService.updateNamaProyekById(id, proyekRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        }catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    @DeleteMapping("/{uuid}")
    public ResponseEntity<?> deleteNamaProyekById(@PathVariable("uuid") String id){
        try{
            Response response = proyekService.deleteNamaProyekById(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        }catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
