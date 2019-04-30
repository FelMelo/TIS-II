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

import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajha
 */
public class Empresa {

    private static final Map<String, Empresa> Cadastro = new HashMap<>();


    public static Funcionario pesquisar(String nome) {
        return Empresa.get(nome);
    }

    private static Funcionario get(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private final String nome;
    private final String cnpj;
    

    public Empresa(String nome, String cnpj) {
        
        this.nome = nome;
        this.cnpj = cnpj;
    }
}