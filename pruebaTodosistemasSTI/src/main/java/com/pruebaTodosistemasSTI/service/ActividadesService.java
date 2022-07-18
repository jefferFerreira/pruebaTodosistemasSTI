package com.pruebaTodosistemasSTI.service;

import com.pruebaTodosistemasSTI.entity.Actividades;
import com.pruebaTodosistemasSTI.repo.ActividadesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesService {
    
    @Autowired
    private ActividadesRepo actividadesrepo;
    
    public Actividades insertar(Actividades act) {
        return actividadesrepo.save(act);
    }
    
    public Actividades actualizar(Actividades act) {
        return actividadesrepo.save(act);
    }
    
    public List<Actividades> listar() {
        return actividadesrepo.findAll();
    }
    
    public void eliminar(Actividades act) {
        actividadesrepo.delete(act);
    }
    
}