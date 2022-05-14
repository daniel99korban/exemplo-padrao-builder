package objetos;
/**
 *
 * @author Daniel_Korban
 */
public class ContatoTelefone {
    
    private String nome;
    private String telefone;

    public ContatoTelefone(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ContatoTelefone{" + "nome=" + nome + ", telefone=" + telefone + '}';
    }
    
}
