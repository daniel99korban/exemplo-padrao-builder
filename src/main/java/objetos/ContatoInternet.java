package objetos;
/**
 *
 * @author Daniel_Korban
 */
public class ContatoInternet {
    private String nome;
    private String email;

    public ContatoInternet(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContatoInternet{" + "nome=" + nome + ", email=" + email + '}';
    }
    
}
