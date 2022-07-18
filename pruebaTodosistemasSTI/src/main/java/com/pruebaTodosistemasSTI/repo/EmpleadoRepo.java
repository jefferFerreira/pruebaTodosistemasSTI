package com.pruebaTodosistemasSTI.repo;

import com.pruebaTodosistemasSTI.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer>{
    
    
}
