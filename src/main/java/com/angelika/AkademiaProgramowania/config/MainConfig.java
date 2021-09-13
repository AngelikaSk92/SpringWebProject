package com.angelika.AkademiaProgramowania.config;

import com.angelika.AkademiaProgramowania.domain.repository.DBKnightRepository;
import com.angelika.AkademiaProgramowania.domain.repository.InMemoryRepository;
import com.angelika.AkademiaProgramowania.domain.repository.KnightRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by &[User] and &[Date].
 */
@Configuration
public class MainConfig {


    @Bean(name="inMemoryRepository")
    @Primary
    public KnightRepository createMemoRepo(){
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name="DBKnightRepository")
    public KnightRepository createDBKnigtRepo(){
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }
}
