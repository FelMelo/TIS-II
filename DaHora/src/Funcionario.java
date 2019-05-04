
import java.util.HashMap;
import java.util.Map;

public class Funcionario {

    private static final Map<String, Funcionario> Cadastro = new HashMap<>();


    public static Funcionario pesquisar(String nome) {
        return Funcionario.get(nome);
    }

    private static Funcionario get(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private final String nome;
    private final String cpf;
    

    public Funcionario(String nome, String cpf) {
        
        this.nome = nome;
        this.cpf = cpf;
    }
}