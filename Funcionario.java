import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Funcionario {

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + "]";
	}

	static Funcionario get(String nome) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	private static String nome;
	private String cpf;

	public Funcionario(String nome, String cpf) {

		this.nome = nome;
		this.cpf = cpf;
	}

	public static void CadastroFuncionario(File fileFunc, Funcionario funcionario) throws FileNotFoundException {

		FileOutputStream saida = null;
		OutputStreamWriter gravador = null;
		BufferedWriter buffer_saida = null;

		BufferedReader buffRead = new BufferedReader(new FileReader(fileFunc));

		buffRead.lines().count();

		try {
			saida = new FileOutputStream(fileFunc, true);
			gravador = new OutputStreamWriter(saida);
			buffer_saida = new BufferedWriter(gravador);
			buffRead.lines().count();

			buffer_saida.write(funcionario.nome + " - ");
			buffer_saida.write(funcionario.cpf);

			buffer_saida.newLine();

			buffer_saida.flush();
			buffRead.close();
		} catch (IOException e) {
		}
	}

	public static String ConsultaFuncionario(File fileFunc, String nomeFunc) throws FileNotFoundException {

		try {
			
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileFunc));
			String linha = "";
			String vetorlido[];
			vetorlido = linha.split(" - ");
			
			while ((linha = bufferedReader.readLine())!= null && vetorlido[0] != nomeFunc) {
				
				linha = bufferedReader.readLine();
				
				if (vetorlido[0] == nomeFunc) {
					System.out.println(linha);
				}
			}
		}
			catch (IOException e) {
		}
		return nomeFunc;
	}
}		
