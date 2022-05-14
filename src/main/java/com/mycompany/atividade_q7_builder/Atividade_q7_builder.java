package com.mycompany.atividade_q7_builder;

import builders.BuilderContatoCompleto;
import builders.BuilderContatoTelefone;
import builders.BuilderContatoInternet;
import objetos.ContatoCompleto;
import objetos.ContatoInternet;
import objetos.ContatoTelefone;

/**
 *
 * @author Daniel_Korban
 */
public class Atividade_q7_builder {

    public static void main(String[] args) {
        // classe diretor
        Diretor diretor = new Diretor();        
        
        // construir um objeto contato internet
        BuilderContatoInternet builderContatoInternet = new BuilderContatoInternet();
        diretor.criarContatoInternet(builderContatoInternet);
        
        // construir um objeto contato telefone
        BuilderContatoTelefone builderContatoTelefone = new BuilderContatoTelefone();
        diretor.criarContatoTelefone(builderContatoTelefone);
        
        // construir um objeto contato completo
        BuilderContatoCompleto builderContatoCompleto = new BuilderContatoCompleto();
        diretor.criarContatoCompleto(builderContatoCompleto);
        
        
        // obtendo e imprimindo o produto
        ContatoInternet contInt = builderContatoInternet.getContato();
        System.out.println(contInt);
        System.out.println("===========================");
        
        ContatoTelefone contTel = builderContatoTelefone.getContato();
        System.out.println(contTel);
        System.out.println("===========================");
        
        ContatoCompleto contCom = builderContatoCompleto.getContato();
        System.out.println(contCom);
        System.out.println("===========================");
        
    }
}