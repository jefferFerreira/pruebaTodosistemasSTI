package com.pruebaTodosistemasSTI.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Actividades")
@Data

public class Actividades {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String descripcion;
    private String estado;
    private Date fecha_creado;
    private Date fecha_ejecucion;
    @ManyToOne
    @JoinColumn(name = "codigo_empleado")
    private Empleado empleado; 

}