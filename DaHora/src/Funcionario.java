

public class Funcionario {

    static Funcionario get(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String nome;
    private String cpf;
    
    

    public Funcionario(String nome, String cpf) {
        
        this.nome = nome;
        this.cpf = cpf;
    }
}