package com.pruebaTodosistemasSTI.service;

import com.pruebaTodosistemasSTI.entity.Empleado;
import com.pruebaTodosistemasSTI.repo.EmpleadoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
    
    @Autowired
    private EmpleadoRepo empleadorepo;
    
    public Empleado obtener(Integer codigo){
        return empleadorepo.getById(codigo);
    }
    public Empleado insertar(Empleado emp) {
        return empleadorepo.save(emp);
    }
    
    public Empleado actualizar(Empleado emp) {
        return empleadorepo.save(emp);
    }
    
    public List<Empleado> listar() {
        return empleadorepo.findAll();
    }
    
    public void eliminar(Integer codigo) {
        empleadorepo.deleteById(codigo);
    }
    
}
