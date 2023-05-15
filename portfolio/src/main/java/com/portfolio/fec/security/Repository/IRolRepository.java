
package com.portfolio.fec.security.Repository;

import com.portfolio.fec.security.Entity.Rol;
import com.portfolio.fec.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository {

    public Optional<Rol> findByRolNombre(RolNombre rolNombre);

    public void save(Rol rol);
    public interface iRolRepository extends JpaRepository<Rol, Integer> {
       Optional<Rol> findByRoleNombre(RolNombre rolNombre) ;
       
    }
}
