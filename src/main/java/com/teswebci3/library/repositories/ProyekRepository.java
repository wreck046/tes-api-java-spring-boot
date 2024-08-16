package com.teswebci3.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teswebci3.library.models.proyek;

@Repository
public interface ProyekRepository extends JpaRepository<proyek, String>{
    
} 