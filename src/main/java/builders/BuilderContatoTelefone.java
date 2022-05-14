package builders;

import objetos.ContatoTelefone;

/**
 *
 * @author Daniel_Korban
 */
public class BuilderContatoTelefone implements Builder{
    
    private String nome;
    private String telefone;
    
    @Override
    public void obterNome(String nome) {
        this.nome = nome; 
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void setEndereco(String endereco) {
        return;
    }

    @Override
    public void setEmail(String email) {
        return;
    }
    
    public ContatoTelefone getContato(){
        return new ContatoTelefone(nome, telefone);
    }
    
}
