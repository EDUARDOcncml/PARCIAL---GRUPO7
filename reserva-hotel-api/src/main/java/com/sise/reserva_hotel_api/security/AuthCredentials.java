package com.sise.reserva_hotel_api.security;

import lombok.Data;

@Data
public class AuthCredentials {
    private String email;
    private String Password;
}
