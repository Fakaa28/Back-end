
package com.portfolio.facun.Security.Controller;

public class Mensaje {
    private String mensaje;
    
    //Builder

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    // G & S

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}