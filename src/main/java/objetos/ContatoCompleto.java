package objetos;
/**
 *
 * @author Daniel_Korban
 */
public class ContatoCompleto {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public ContatoCompleto(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContatoCompleto{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }
}
