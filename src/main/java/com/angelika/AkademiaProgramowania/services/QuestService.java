package com.angelika.AkademiaProgramowania.services;

import com.angelika.AkademiaProgramowania.domain.Quest;
import com.angelika.AkademiaProgramowania.domain.repository.KnightRepository;
import com.angelika.AkademiaProgramowania.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class QuestService {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    final static Random rand= new Random();

    public void assignRandomQuest(String knightName){
        if(questRepository.getAll().size()==0) {
           Quest quest = new Quest("idz na warte");
            knightRepository.getKnight(knightName).setQuest(quest);
            questRepository.deleteQuest(quest);

        }else {
            Quest randomQuest = questRepository.getAll().get(rand.nextInt(questRepository.getAll().size()));
            knightRepository.getKnight(knightName).setQuest(randomQuest);
            questRepository.deleteQuest(randomQuest);
        }
    }

}
