package com.angelika.AkademiaProgramowania.domain.repository;

import com.angelika.AkademiaProgramowania.domain.Quest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by &[User] and &[Date].
 */
@Component
public class QuestRepository {

    List<Quest> questList = new ArrayList<>();
    Random random = new Random();

    public void createQuest(String description){
        questList.add(new Quest(description));
    }

    public List<Quest> getAll(){
        return questList;
    }

    public void deleteQuest(Quest quest){
        questList.remove(quest);
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }

    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj ksiezniczke");
        descriptions.add("Wez udzial w turnieju");
        descriptions.add("Zabij bande goblinow");
        descriptions.add("Zabij smoka");

        String description = descriptions.get(random.nextInt(descriptions.size()));
        System.out.println("Utworzylem zdanie o opisie " + description);
        createQuest(description);
    }





}
