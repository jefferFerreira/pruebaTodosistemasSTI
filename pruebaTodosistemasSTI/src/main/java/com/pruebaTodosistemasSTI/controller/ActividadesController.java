package com.pruebaTodosistemasSTI.controller;

import com.pruebaTodosistemasSTI.entity.Actividades;
import com.pruebaTodosistemasSTI.service.ActividadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/actividades")
public class ActividadesController {
    
    @Autowired
    private ActividadesService actividadesservice;
    
    @GetMapping
    public List<Actividades> listar(){
        return actividadesservice.listar();
    }
     
    @GetMapping("{codigo}")
    public Actividades obtener(@PathVariable Integer codigo){
        return actividadesservice.obtener(codigo);
    }
    
    @PostMapping
    public Actividades insertar(@RequestBody Actividades act){
        return actividadesservice.insertar(act);
    }
    
    @PutMapping
    public Actividades actualizar(@RequestBody Actividades act){
        return actividadesservice.actualizar(act);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Actividades act){
        actividadesservice.eliminar(act);
    }
    
}
