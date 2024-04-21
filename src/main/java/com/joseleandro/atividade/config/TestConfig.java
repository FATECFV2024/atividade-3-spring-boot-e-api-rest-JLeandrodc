package com.joseleandro.atividade.config;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.joseleandro.atividade.entities.Endereco;
import com.joseleandro.atividade.repositories.EnderecoRepository;


//Por enquanto, isso vai servir de data base seeding
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {



    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public void run(String... args) throws Exception {

        Endereco end1 = new Endereco(null, "Rua Exemplo", 123, "Cidade Exemplo", "Estado Exemplo", "12345678");
        Endereco end2 = new Endereco(null, "Avenida Principal", 456, "Cidade Grande", "Estado Grande", "87654321");
        Endereco end3 = new Endereco(null, "Rua Secundária", 789, "Cidade Pequena", "Estado Pequeno", "98765432");
        

        // Manda para o banco de dados
        enderecoRepository.saveAll(Arrays.asList(end1, end2, end3));


    }

}