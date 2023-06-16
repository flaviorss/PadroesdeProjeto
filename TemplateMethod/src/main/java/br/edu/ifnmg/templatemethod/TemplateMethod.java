/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.templatemethod;

/**
 *
 * @author Flavio Santos
 */
public class TemplateMethod {

    public static void main(String[] args) {
        
        ProcessadorPagamento pagamentoCredito = new ProcessadorPagamentoCredito();
        pagamentoCredito.processarPagamento();
        
        ProcessadorPagamento pagamentoDebito = new ProcessadorPagamentoCredito();
        pagamentoDebito.processarPagamento();
        
    }
}
