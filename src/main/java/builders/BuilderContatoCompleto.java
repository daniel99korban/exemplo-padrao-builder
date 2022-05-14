/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builders;

import objetos.ContatoCompleto;

/**
 *
 * @author Daniel_Korban
 */
public class BuilderContatoCompleto implements Builder{
    private String nome;
    private String endereco;// pode ser composto
    private String telefone;
    private String email;

    @Override
    public void obterNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    
    public ContatoCompleto getContato(){
        return new ContatoCompleto(nome, endereco, telefone, email);
    }
    
}
