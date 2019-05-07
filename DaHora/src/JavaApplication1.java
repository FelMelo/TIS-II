
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication1 {

    private static final Map<String, Funcionario> Cadastro = new HashMap<>();

    public static void main(String arg[]) {
        //  menu principal
        int opcao;
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
            System.out.print("O que você deseja fazer? ");
            opcao = lerOption.nextInt();

            System.out.print("\n");
            switch (opcao) {
                case 1:
                    CadastroFuncionario();
                    break;
                case 2:
                    CadastroEmpresa();
                    break;
                case 3:
                    //ConsultaFuncionario();
                    break;
                case 4:
//                    JavaApplication1.ConsultaEmpresa();
                    break;
                case 5:
                    Entrada();
                    break;
                case 6:
                    Saida();
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
            while ((linha = reader.readLine()) != null) {
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
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            // Imprime confirmacao
            System.out.println("Salvo!");
        } catch (IOException e) {
        }
    }

    public static void ConsultaEmpresa(ArrayList<Funcionario> ListaFuncionario, String nome) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o nome do Funcionario que deseja pesquisar:\n");
        nome = ler.nextLine();
        ConsultaEmpresa(ListaFuncionario, nome);
        //break;

        File dir = new File("C:\\TutorialArquivos");
        File arq = new File(dir, "User.txt");

        try {

            BufferedReader bufferedReader;
            try (FileReader fileReader = new FileReader(arq)) {
                bufferedReader = new BufferedReader(fileReader);
                String linha = bufferedReader.readLine();
                while (linha != null) {
                    if (ListaFuncionario.equals(nome)) {
                        System.out.println("Funcionário cadastrado");
                    } else {
                        System.out.println("Nome não cadastrado");
                    }
                    linha = bufferedReader.readLine();
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
        }
    }

    /*private static void ConsultaEmpresa() {
        String nome, ListaEmpresa;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o nome da Empresa que deseja pesquisar:\n");
        nome = ler.nextLine();
        ConsultaEmpresa(ListaEmpresa, nome);

        File dir = new File("C:\\TutorialArquivos");
        File arq = new File(dir, "User.txt");

        try {

            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = bufferedReader.readLine();
            while (linha != null) {
                if (ListaEmpresa.equals(nome)) {
                    System.out.println("Empresa cadastrada");
                } else {
                    System.out.println("Empresa não cadastrada");
                }
                linha = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    private static void Entrada() {
        HorasTrabalhadas horas = new HorasTrabalhadas();

        Scanner e = new Scanner(System.in);
        String s = null;

        System.out.printf("Confirmar ponto de chegada?\n");
        System.out.printf("Sim[s] ou Não[n]?\n");
        String respE = e.nextLine();
        if (respE.equals(s)) // e.Entrada();
        {
            System.out.printf("Hora de chegada:" + HorasTrabalhadas.CheckIn());
        } else {
            System.out.println("Programa encerrado.");
        }

    }

    private static void Saida() {
        String s = null;
        Scanner o = new Scanner(System.in);
        System.out.printf("Confirmar ponto de saída?\n");
        System.out.printf("Sim[s] ou Não[n]?\n");
        String respS = o.nextLine();

        if (respS.equals(s)) // o.Saida();
        {
            System.out.printf("Hora de saida:" + HorasTrabalhadas.CheckOut());
        } else {
            System.out.println("Programa encerrado.");
        }
    }
}
