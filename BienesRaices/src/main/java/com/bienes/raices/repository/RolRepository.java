package com.bienes.raices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bienes.raices.model.Rol;
import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {
   Optional<Rol> findByNombre(String nombre);
}
