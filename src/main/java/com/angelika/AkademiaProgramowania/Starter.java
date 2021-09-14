package com.angelika.AkademiaProgramowania;

import com.angelika.AkademiaProgramowania.domain.repository.KnightRepository;
import com.angelika.AkademiaProgramowania.domain.repository.QuestRepository;
import com.angelika.AkademiaProgramowania.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by &[User] and &[Date].
 */
@Component
public class Starter implements CommandLineRunner {


    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;


    @Override
    public void run(String... args) throws Exception {



    }
}
