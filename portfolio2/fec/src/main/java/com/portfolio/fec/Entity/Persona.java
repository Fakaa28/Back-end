
package com.portfolio.fec.Entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Entity;

@Getter @Setter
@Entity
public class Persona implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
   @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
   private String nombre;
   
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
     private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;

  
    }
    
    

