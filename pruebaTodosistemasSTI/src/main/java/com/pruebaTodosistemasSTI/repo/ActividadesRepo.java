package com.pruebaTodosistemasSTI.repo;

import com.pruebaTodosistemasSTI.entity.Actividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadesRepo extends JpaRepository<Actividades, Integer>{
    
}
