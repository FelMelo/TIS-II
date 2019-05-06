import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication1 {
    
    
    private static final Map<String, Funcionario> Cadastro = new HashMap<>();


    public static Funcionario pesquisar(String nome) {
        return Funcionario.get(nome);
    }

    
    
   public static void main (String arg []){
	//  menu principal
		int opcao = 0;
		Scanner lerOption = new Scanner(System.in);
		do {
			System.out.println("\n\n              ##### DaHora - Banco de Horas #####");
			System.out.println("\n                  ================================");
			System.out.println("                  |     1 - Cadastro Funcionário   |");
			System.out.println("                  |     2 - Cadastro Empresa       |");
			System.out.println("                  |     3 - Consulta Funcionário   |");
			System.out.println("                  |     4 - Consulta Empresa       |");
                        System.out.println("                  |     5 - Fazer Check In         |");
                        System.out.println("                  |     6 - Fazer Check Out        |");
			System.out.println("                  |     0 - Sair                   |");
			System.out.println("                  =================================\n");
			System.out.println                    ("Opção -> ");
			opcao = lerOption.nextInt();
			
			System.out.print("\n");
			switch (opcao) {
			case 1: CadastroFuncionario();
				break;
			case 2:
				CadastroEmpresa ();
				break;
                        case 3:
				ConsultaFuncionario ();
				break;
                        case 4:
				ConsultaEmpresa ();
				break;    
                        case 5:
				Entrada ();
				break; 
                        case 6:
				Saida ();
				break; 
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
		
		System.out.println("Programa encerrado.");		
   }
   private static void CadastroFuncionario() {       
       Scanner ler = new Scanner(System.in);
       // Conteudo
		System.out.printf("Informe seu nome:\n");
		String nome = ler.nextLine();
		System.out.printf("Informe seu CPF:\n");
		String cpf = ler.nextLine();
			try {
           // Cria arquivo
           File file = new File("teste.txt");
           // Se o arquivo nao existir, ele gera
           if (!file.exists()) {
               file.createNewFile();
           }
           // Prepara para escrever no arquivo
           FileWriter fw = new FileWriter(file.getAbsoluteFile());
           // Escreve e fecha arquivo
           try (BufferedWriter bw = new BufferedWriter(fw)) {
               // Escreve e fecha arquivo
               bw.write(nome + "\n");
               bw.write(cpf + "\n");               
           }           
           // Le o arquivo
           FileReader ler1 = new FileReader("teste.txt");
           BufferedReader reader = new BufferedReader(ler1);  
           String linha;
           while( (linha = reader.readLine()) != null ){
               System.out.println(linha);
           }
           // Imprime confirmacao
           System.out.println("Salvo!");
       } catch (IOException e) {
       }       
   }
   private static void CadastroEmpresa() {	   
	   Scanner ler = new Scanner(System.in);
       // Conteudo
		System.out.printf("Informe o nome da empresa:\n");
		String nomeEmp = ler.nextLine();
		System.out.printf("Informe CNPJ:\n");
		String cnpj = ler.nextLine();  		
			try {
           // Cria arquivo
           File file = new File("teste.txt");
           // Se o arquivo nao existir, ele gera
           if (!file.exists()) {
               file.createNewFile();
           }
           // Prepara para escrever no arquivo
           FileWriter fw = new FileWriter(file.getAbsoluteFile());
           // Escreve e fecha arquivo
           try (BufferedWriter bw = new BufferedWriter(fw)) {
               // Escreve e fecha arquivo
               bw.write(nomeEmp + "\n");
               bw.write(cnpj + "\n");               
           }           
           // Le o arquivo
           FileReader ler1 = new FileReader("teste.txt");
           BufferedReader reader = new BufferedReader(ler1);  
           String linha;
           while( (linha = reader.readLine()) != null ){
               System.out.println(linha);
           }
           // Imprime confirmacao
           System.out.println("Salvo!");
       } catch (IOException e) {
       }	   
   }
     private static void ConsultaFuncionario() {
       
    }
     private static void ConsultaEmpresa() {
      
     }
     private static void Entrada() {
         Scanner e = new Scanner(System.in);
     
	System.out.printf("Deseja bater o ponto de chegada?\n");
        System.out.printf("Sim[s] ou Não[n]?\n");
	String respE = e.nextLine();
        if (respE == s) {
               e.Entrada();
           } else{
            System.out.println("Programa encerrado.");
        }
    }
    private static void Saida() {
        Scanner o = new Scanner(System.in);
     
	System.out.printf("Deseja bater o ponto de saída?\n");
	System.out.printf("Sim[s] ou Não[n]?\n");
	String respS = o.nextLine();
    }    if (respE == s) {
               o.Saida();
           } else{
            System.out.println("Programa encerrado.");
        }    }

        //CalculoHoras()
    } 
  
