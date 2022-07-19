package com.pruebaTodosistemasSTI.controller;

import com.pruebaTodosistemasSTI.entity.Empleado;
import com.pruebaTodosistemasSTI.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoservice;
    
    @GetMapping
    public List<Empleado> listar(){
        return empleadoservice.listar();
    }
    
    @GetMapping("{codigo}")
    public Empleado obtener(@PathVariable Integer codigo){
        return empleadoservice.obtener(codigo);
    }
    
    @PostMapping
    public Empleado insertar(@RequestBody Empleado emp){
        return empleadoservice.insertar(emp);
    }
    
    @PutMapping
    public Empleado actualizar(@RequestBody Empleado emp){
        return empleadoservice.actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Empleado emp){
        empleadoservice.eliminar(emp);
    }
}
