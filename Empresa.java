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

	public static String ConsultaEmpresa(File fileEmpre, String razaoSocialEmpre) throws FileNotFoundException {

		try {
			
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileEmpre));
			String linha = "";
			String vetorlido[];
			vetorlido = linha.split(" - ");
			
			while ((linha = bufferedReader.readLine())!= null && vetorlido[0] != razaoSocialEmpre) {
				
				linha = bufferedReader.readLine();
				
				if (vetorlido[0] == razaoSocialEmpre) {
					System.out.println(linha);
				}
			}
		}
			catch (IOException e) {
		}
		return razaoSocialEmpre;
	}
}		
