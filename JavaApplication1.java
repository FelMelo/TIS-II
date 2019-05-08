
import java.io.*;
import java.util.Scanner;

public class JavaApplication1 {


    public static void main(String arg[]) throws FileNotFoundException {
    	
    	File fileFunc = new File("Funcionario.txt");
    	File fileEmpre = new File("Company.txt");
    	File fileHorastrab = new File("HorasTrabalhadas.txt");
    	
        int opcao;
        Scanner lerOption = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        
        do {
        	Menu.imprimiMenu();
			opcao = lerOption.nextInt();
			
			System.out.print("\n");
			switch (opcao) {
			
                case 1:
                	
                    System.out.printf("Informe o nome do Funcionario:\n");
                    String nome = ler.nextLine();
                    System.out.printf("Informe o CPF do funcionario:\n");
                    String cpf = ler.nextLine();
    		 		Funcionario.CadastroFuncionario(fileFunc, (new Funcionario(nome, cpf)));
                    
                    break;
                case 2:
        
                	System.out.printf("Informe a Razão Social da empresa:\n");
    		 		String razaosocial = ler.nextLine();
    		 		System.out.printf("Informe o CNPJ da empresa:\n");
    		 		String cnpj = ler.nextLine();
    		 		Empresa.CadastroEmpresa(fileEmpre, (new Empresa(razaosocial, cnpj)));
    		 		
    				break;
                case 3:
                	
                    System.out.printf("Informe o nome do Funcionario que deseja pesquisar:\n");
                    nome = ler.nextLine();
                    Funcionario.ConsultaFuncionario(fileFunc, nome);
                    System.out.println(Funcionario.ConsultaFuncionario(fileFunc, nome));
              
                    break;
                case 4:
                	
                	System.out.printf("Informe o nome da Empresa que deseja pesquisar:\n");
                    nome = ler.nextLine();
                    //Funcionario.ConsultaFuncionario(fileFunc, nome);
                    
                    break;
                case 5:
                	
                	 HorasTrabalhadas horas = new HorasTrabalhadas();
                	 System.out.printf("Confirmar ponto de chegada?\n");
                	 System.out.printf("Sim[s] ou Não[n]?\n");
                	 String respE = ler.nextLine();
                	 if (respE.equals("s")) {
                		 System.out.printf("Hora de chegada:" + HorasTrabalhadas.CheckIn());
                	 } else {
                		 System.out.println("Programa encerrado.");
                	 }
                	 
                	 break;
                case 6:
                	
                	System.out.printf("Confirmar ponto de saída?\n");
                    System.out.printf("Sim[s] ou Não[n]?\n");
                    String respS = ler.nextLine();
                    if (respS.equals("s")) {
                        System.out.printf("Hora de saida:" + HorasTrabalhadas.CheckOut());
                    } else {
                        System.out.println("Programa encerrado.");
                    }
                    
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

    

//    private static void ConsultaEmpresa() {
        
//
//        File dir = new File("C:\\TutorialArquivos");
//        File arq = new File(dir, "User.txt");
//
//        try {
//
//            FileReader fileReader = new FileReader(arq);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String linha = bufferedReader.readLine();
//            while (linha != null) {
//                if (ListaEmpresa.equals(nome)) {
//                    System.out.println("Empresa cadastrada");
//                } else {
//                    System.out.println("Empresa não cadastrada");
//                }
//                linha = bufferedReader.readLine();
//            }
//            fileReader.close();
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
