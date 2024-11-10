package com.nuevo.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuevo.proyecto.Model.Libros;

public interface LibroRepository extends JpaRepository<Libros , Long>{
    
}
