package com.AluraCursos.FrasesScreenMatch.controller;

import com.AluraCursos.FrasesScreenMatch.dto.FraseDTO;
import com.AluraCursos.FrasesScreenMatch.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return service.obtenerFraseAleatoria();
    }
}
