package com.sise.reserva_hotel_api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sise.reserva_hotel_api.entities.usuario;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
    @Autowired
    private usuarioServicesImpl usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
         usuario usuario = usuarioRepository
                            .findOneByEmail(email)
                            .orElseThrow(()-> new UsernameNotFoundException("El usuario con email"+ email + "no existe"));

        return new UserDetailsImpl(usuario);                    
    }



}
