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

	private String nome;
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

			buffer_saida.write(funcionario.nome + "-");
			buffer_saida.write(funcionario.cpf);

			buffer_saida.newLine();

			buffer_saida.flush();
			buffRead.close();
		} catch (IOException e) {
		}
	}

	public static boolean ConsultaFuncionario(File fileFunc, String nomeFunc) throws FileNotFoundException {

		boolean achou = false;

		try {

			FileReader fileReader = new FileReader(fileFunc);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linha = bufferedReader.readLine();

			while (linha != null && achou == false) {

				String vetorlido[];
				vetorlido = linha.split("-");
				System.out.println("Vetor " + vetorlido[0]);
				System.out.println(nomeFunc);
				
				if (nomeFunc == vetorlido[0]) {
					achou = true;
				}
				linha = bufferedReader.readLine();
			}

			fileReader.close();
			bufferedReader.close();

		} catch (IOException e) {
		}
		return achou;
	}

}