package com.angelika.AkademiaProgramowania.domain.repository;

import com.angelika.AkademiaProgramowania.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.*;

public class InMemoryRepository implements KnightRepository {

    Map<Integer, Knight> knights = new HashMap<>();

    @Override
    public void createKnight(String name, int age){

        Knight newKnight = new Knight(name, age);
        newKnight.setId(getNewId());
        knights.put(newKnight.getId(), newKnight);
    }

    private int getNewId() {
        if (knights.isEmpty()) {
            return 0;
        } else {
           return knights.keySet().stream().max(Integer::max).get()+1;
        }
    }

    @Override
    public Collection<Knight> getAllKnights(){
        return knights.values();
    }

    @Override
    public Knight getKnight(String name){
        Optional<Knight> knightByName=knights.values().stream().filter(knight -> knight.getName().equals(name)).findAny();
        return knights.get(knightByName.orElseGet(null));
    }

    @Override
    public void deleteKnight(Integer id){
        knights.remove(id);
    }

    @Override
    @PostConstruct
    public void build(){
        createKnight("Lancelot",35);
        createKnight("Percival",40);
        createKnight("Diego",58);

    }

    @Override
    public Knight getKnightById(Integer id) {
        Knight knight = knights.get(id);
        return knight;
    }

    @Override
    public String toString() {
        return "InMemoryRepository{" +
                "knights=" + knights +
                '}';
    }
}
