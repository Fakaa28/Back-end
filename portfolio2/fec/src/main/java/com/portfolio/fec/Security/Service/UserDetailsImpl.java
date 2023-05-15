
package com.portfolio.fec.Security.Service;

import com.portfolio.fec.Security.Entity.Usuario;
import com.portfolio.fec.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService; 

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String nombreUsuario = null;
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);

    }
}
