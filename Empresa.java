import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Empresa {

	@Override
	public String toString() {
		return "Empresa [razaosocial=" + razaosocial + ", CNPJ=" + cnpj + "]";
	}

	public static Empresa pesquisar(String razaosocial) {
		return Empresa.get(razaosocial);
	}

	public static Empresa get(String razaosocial) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	private String razaosocial;
	private String cnpj;

	public Empresa(String razaosocial, String cnpj) {

		this.razaosocial = razaosocial;
		this.cnpj = cnpj;
	}

	public static void CadastroEmpresa(File fileEmpre, Empresa Empresa) throws FileNotFoundException {

		FileOutputStream saida = null;
		OutputStreamWriter gravador = null;
		BufferedWriter buffer_saida = null;

		BufferedReader buffRead = new BufferedReader(new FileReader(fileEmpre));

		buffRead.lines().count();

		try {

			saida = new FileOutputStream(fileEmpre, true);
			gravador = new OutputStreamWriter(saida);
			buffer_saida = new BufferedWriter(gravador);
			buffRead.lines().count();

			buffer_saida.write(Empresa.razaosocial + " ");
			buffer_saida.write(Empresa.cnpj);
			buffer_saida.newLine();

			buffer_saida.flush();
			buffRead.close();
		} catch (Exception e) {
		}
	}

	public static void ConsultaEmpresa(File fileEmpre, Empresa empresa) throws FileNotFoundException {

		try {

			FileReader fileReader = new FileReader(fileEmpre);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linha = bufferedReader.readLine();

			while (linha != null) {
				if (fileEmpre.equals(empresa)) {
					System.out.println("Empresa cadastrado");
				} else {
					System.out.println("Nome não empresa");
				}
				linha = bufferedReader.readLine();
			}

			fileReader.close();
			bufferedReader.close();

		} catch (IOException e) {
		}
	}
}