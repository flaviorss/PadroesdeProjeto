/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.templatemethod;

/**
 *
 * @author Flavio Santos
 */
public class ProcessadorPagamentoCredito extends ProcessadorPagamento{

    @Override
    protected void debitar(){
        System.out.println("Debitando Credito...");
    }
    
    @Override
    protected void notificar(){
        super.notificar();
        System.out.println("Notificacao Adicional de Credito!!");
    }

}
