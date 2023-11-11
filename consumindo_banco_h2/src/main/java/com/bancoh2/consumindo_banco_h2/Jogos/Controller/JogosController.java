package com.bancoh2.consumindo_banco_h2.Jogos.Controller;

import com.bancoh2.consumindo_banco_h2.Jogos.Entity.Jogos;
import com.bancoh2.consumindo_banco_h2.Jogos.Service.JogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogosController {

    @Autowired
    private JogosService jogosService;

    @GetMapping
    public List<Jogos> getListaJogosResource(){ return this.jogosService.getListaJogosService(); }

}
