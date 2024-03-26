package com.diogocode.sdw.application;

import com.diogocode.sdw.domain.model.Champions;
import com.diogocode.sdw.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champions> findAll(){
        return repository.findAll();
    }

}
