package com.AluraCursos.FrasesScreenMatch.service;

import com.AluraCursos.FrasesScreenMatch.dto.FraseDTO;
import com.AluraCursos.FrasesScreenMatch.model.Frase;
import com.AluraCursos.FrasesScreenMatch.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
