package com.angelika.AkademiaProgramowania.domain.repository;

import com.angelika.AkademiaProgramowania.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;

/**
 * Created by &[User] and &[Date].
 */
public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    void deleteKnight(Integer id);

    void build();

    Knight getKnightById(Integer id);
}
