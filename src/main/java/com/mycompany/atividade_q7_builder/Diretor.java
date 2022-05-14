package com.mycompany.atividade_q7_builder;

import builders.Builder;
import objetos.ContatoInternet;

/**
 * @author Daniel_Korban
 */
class Diretor {
    
    public void criarContatoInternet(Builder builder){
        builder.obterNome("fulanoIternet");
        builder.setEmail("fulanoInternet@gmail.com");
    }
    
    public void criarContatoTelefone(Builder builder){
        builder.obterNome("fulanoTelefone");
        builder.setTelefone("(98)99999-9999");
    }
    
    public void criarContatoCompleto(Builder builder){
        builder.obterNome("fulanoCompleto");
        builder.setEndereco("rua 1 bairro 1 casa 1");
        builder.setTelefone("(98) 99999-9999");
        builder.setEmail("fulanoCompleto@gmail.com");
    }
    
}
