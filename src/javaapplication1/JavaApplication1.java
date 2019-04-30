package javaapplication1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {


    
   public static void main (String arg []) throws FileNotFoundException{
	   
	// Cria arquivo
       File file = new File("teste.txt");
       ArrayList<Funcionario> ListaFuncionario = new ArrayList();
       
	//  menu principal
		int opcao = 0;
		Scanner lerOption = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		do {
			Menu.imprimiMenu();
			opcao = lerOption.nextInt();
			
			System.out.print("\n");
			switch (opcao) {
			case 1: 
				System.out.printf("Informe seu nome:\n");
		 		String nome = ler.nextLine();
		 		System.out.printf("Informe seu CPF:\n");
		 		String cpf = ler.nextLine();
		 		ListaFuncionario.add(new Funcionario(nome, cpf));
		 		Funcionario.salvarFuncionario(file, (new Funcionario(nome, cpf)));
		 		
				break;
			case 2:
				System.out.printf("Informe seu Razão Social da empresa:\n");
		 		String razaosocial = ler.nextLine();
		 		System.out.printf("Informe seu CNPJ:\n");
		 		String CNPJ = ler.nextLine();
		 		ListaFuncionario.add(new Funcionario(razaosocial, CNPJ));
		 		Funcionario.salvarFuncionario(file, (new Funcionario(razaosocial, CNPJ)));
				break;
            case 3:
				//Funcionario.ConsultaFuncionario ();
				break;
            case 4:
				ConsultaEmpresa ();
				break;
            case 5:
				FazerCheckIn();
				break;
            case 6:
				FazerCheckOut();
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

//   private static void CadastroEmpresa() {
//	   
//	   Scanner ler = new Scanner(System.in);
//       // Conteudo
//
//		System.out.printf("Informe o nome da empresa:\n");
//		String nomeEmp = ler.nextLine();
//		System.out.printf("Informe CNPJ:\n");
//		String cnpj = ler.nextLine();
//		   
//		
//			try {
//
//           // Cria arquivo
//           File file = new File("teste.txt");
//
//           // Se o arquivo nao existir, ele gera
//           if (!file.exists()) {
//               file.createNewFile();
//           }
//
//           // Prepara para escrever no arquivo
//           FileWriter fw = new FileWriter(file.getAbsoluteFile());
//           // Escreve e fecha arquivo
//           try (BufferedWriter bw = new BufferedWriter(fw)) {
//               // Escreve e fecha arquivo
//               bw.write(nomeEmp + "\n");
//               bw.write(cnpj + "\n");
//               
//           }
//           
//           // Le o arquivo
//           FileReader ler1 = new FileReader("teste.txt");
//           BufferedReader reader = new BufferedReader(ler1);  
//           String linha;
//           while( (linha = reader.readLine()) != null ){
//               System.out.println(linha);
//           }
//
//           // Imprime confirmacao
//           System.out.println("Feito =D");
//
//       } catch (IOException e) {
//       }
//	   
//   }

   private static void ConsultaFuncionario() {
	   	   
   }

   private static void ConsultaEmpresa() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   private static void FazerCheckIn() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   private static void FazerCheckOut() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
	   

                     
}