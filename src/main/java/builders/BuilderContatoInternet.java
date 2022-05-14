package builders;

import objetos.ContatoInternet;

/**
 *
 * @author Daniel_Korban
 */
public class BuilderContatoInternet implements Builder{
    
    private String nome;
    private String email;

    @Override
    public void obterNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void setEndereco(String endereco) {
        return;
    }

    @Override
    public void setTelefone(String telefone) {
        return;
    }

    public ContatoInternet getContato(){
        return new ContatoInternet(nome, email);
    }
    
}
