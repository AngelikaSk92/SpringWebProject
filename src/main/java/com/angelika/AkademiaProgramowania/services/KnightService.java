package com.angelika.AkademiaProgramowania.services;

import com.angelika.AkademiaProgramowania.domain.Knight;
import com.angelika.AkademiaProgramowania.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class KnightService {


    @Autowired
    KnightRepository knightRepository;


    public List<Knight> getKnights(){
        List<Knight> allKnights = new ArrayList<>(knightRepository.getAllKnights());
        return allKnights;
    }
    public void saveKnight(Knight knight) {
        knightRepository.createKnight(knight.getName(), knight.getAge());
    }

    public Knight getKnight(Integer id) {
       return knightRepository.getKnightById(id);
    }
}
