package com.sise.reserva_hotel_api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sise.reserva_hotel_api.model.usuario;
import com.sise.reserva_hotel_api.repositories.IUsuarioRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        usuario usuario = usuarioRepository
                            .findOptional(email)
                            .orElseTrow(()-> new UsernameNotFoundException("El usuario con email"+ email+ "no existe"));

        return new UserDetailsImpl(usuario);                    
    }



}
