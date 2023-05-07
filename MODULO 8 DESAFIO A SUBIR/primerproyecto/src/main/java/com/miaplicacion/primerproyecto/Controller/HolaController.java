
package com.miaplicacion.primerproyecto.Controller;

import com.miaplicacion.primerproyecto.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
  import org.springframework.web.bind.annotation.RequestBody;      
import org.springframework.web.bind.annotation.ResponseBody;





@RestController        
public class HolaController {
    
  
    @PostMapping ("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli) {
        
        System.out.println("Datos cliente: " + cli.getNombre() + " Apellido: " + cli.getApellido());
        
    }
  
    @GetMapping ("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre,
            @PathVariable int edad,
            @PathVariable String profesion) {
        return "Hola mundo. Tu nombre es: " + nombre + "Tu edad es: " + edad + " Tu profesion es; " + profesion;
    }
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes() {
    
            List<Cliente> listaClientes = new ArrayList <Cliente>();
            listaClientes.add(new Cliente (1L, "Zlatan", "Ibrahimovic"));
            listaClientes.add(new Cliente (2L, "Zlatan", "Ibrahimovic"));
            listaClientes.add(new Cliente (3L, "Zlatan", "Ibrahimovic"));
           
        return listaClientes;
    }
    
    
    
    
}
