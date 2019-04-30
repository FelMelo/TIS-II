import java.util.HashMap;
import java.util.Map;

public class Empresa {
    private static final Map<String, Empresa> Cadastro = new HashMap<>();

   // public static Empresa pesquisar(String nome) {
      //  return Empresa.get(nome);
    //}

    private static Funcionario get(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private final String nome;
    private final String cnpj;    

    public Empresa(String nome, String cnpj) {
        
        this.nome = nome;
        this.cnpj = cnpj;
    }
}