package com.sise.reserva_hotel_api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

public class usuario {
    @Data
@Entity
@Table(name= "habitacion")
public class Habitacion {

    @Id
    @Column(name = "id_habitacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}
}
