package com.sise.reserva_hotel_api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sise.reserva_hotel_api.entities.usuario;


@Repository
public class IUsuarioRepository extends JpaRepository<usuario, Integer> {

    Optional<usuario> findOneByEmail(String email);
}
