package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajha
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Empresa {
	
	@Override
	public String toString() {
		return "Empresa [razaosocial=" + razaosocial + ", CNPJ=" + cnpj + "]";
	}

	private static final Map<String, Empresa> Cadastro = new HashMap<>();


    public static Empresa pesquisar(String razaosocial) {
        return Empresa.get(razaosocial);
    }

    private static Empresa get(String razaosocial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private final String razaosocial;
    private final String cnpj;
    

    public Empresa(String razaosocial, String cnpj) {
        
        this.razaosocial = razaosocial;
        this.cnpj = cnpj;
    }
    
public static void salvarEmpresa(File file, Empresa Empresa) throws FileNotFoundException {
	
	FileOutputStream saida = null;
	OutputStreamWriter gravador = null;
	BufferedWriter buffer_saida = null;
	
	BufferedReader buffRead = new BufferedReader (new FileReader(file));
	
	buffRead.lines().count();
	
	
	try {
		
	saida = new FileOutputStream(file, true);
	gravador = new OutputStreamWriter(saida);
	buffer_saida = new BufferedWriter(gravador);
	buffRead.lines().count();
		
	buffer_saida.write(Empresa.razaosocial + " ");
	buffer_saida.write(Empresa.cnpj);
	buffer_saida.newLine();
	
	
		
	buffer_saida.flush();
	}catch (Exception Exception) {
		
	}
//		 
//		 	// Le o arquivo
//	       FileReader ler1 = new FileReader("teste.txt");
//	       @SuppressWarnings("resource")
//	       BufferedReader reader = new BufferedReader(ler1);  
//	       String linha;
////	       while( (linha = reader.readLine()) != null ){
////	           System.out.println(linha);
////	           
////	       }
//	       // Prepara para escrever no arquivo
//	       //FileWriter fw = new FileWriter(file.getAbsoluteFile());
//	       // Escreve e fecha arquivo
//	       //try (BufferedWriter bw = new BufferedWriter(fw)) {
//	           // Escreve e fecha arquivo
//	       
//	       BufferedWriter bw = null;
//	       FileOutputStream ow = new FileOutputStream(file, false);
//	       
//	       bw = new BufferedWriter(ow);
//	       reader.lines().count();
//	       
//	           bw.write( funcionario.nome + "\n");
//	           bw.write(funcionario.cpf + "\n");
//	           
//	       
//	           
//	       //}
//
//	       // Imprime confirmacao
//	       System.out.println("Feito =D");
//
//	   } catch (IOException e)
		   
	}

//    private static final Map<String, Empresa> Cadastro = new HashMap<>();
//
//
//    public static Funcionario pesquisar(String nome) {
//        return Empresa.get(nome);
//    }
//
//    private static Funcionario get(String nome) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private final String nome;
//    private final String cnpj;
//    
//
//    public Empresa(String nome, String cnpj) {
//        
//        this.nome = nome;
//        this.cnpj = cnpj;
//    }
}