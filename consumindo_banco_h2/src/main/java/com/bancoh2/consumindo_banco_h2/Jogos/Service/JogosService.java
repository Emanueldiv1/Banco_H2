package com.bancoh2.consumindo_banco_h2.Jogos.Service;

import com.bancoh2.consumindo_banco_h2.Jogos.Entity.Jogos;
import com.bancoh2.consumindo_banco_h2.Jogos.Repository.JogosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogosService {
    @Autowired
    private JogosRepository jogosRepository;

    public List<Jogos> getListaJogosService(){
        return this.jogosRepository.findAll();
    }
}
