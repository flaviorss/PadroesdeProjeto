/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.templatemethod;

/**
 *
 * @author Flavio Santos
 */
public class ProcessadorPagamentoDebito extends ProcessadorPagamento{
    
    @Override
    protected void debitar(){
        System.out.println("Debitando Debito...");
    }
    
    @Override
    protected void finalizar(){
        System.out.println("Finalização de Debito!!");
        super.finalizar();
    }

}
