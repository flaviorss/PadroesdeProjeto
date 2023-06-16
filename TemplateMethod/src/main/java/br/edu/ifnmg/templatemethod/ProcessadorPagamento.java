/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.templatemethod;

/**
 *
 * @author Flavio Santos
 */
abstract class ProcessadorPagamento {
    
    public void processarPagamento(){
        preparar();
        validar();
        debitar();
        notificar();
        finalizar();
    }
    
    protected abstract void debitar();
    
    private void preparar(){
        System.out.println("Reservando Produtos!!");
    }
    
    private void validar(){
        System.out.println("Validando Cadastro!!");
    }
    
    protected void notificar(){
        System.out.println("Notificando Usuario!!");
    }
    
    protected void finalizar(){
        System.out.println("Finalizando Compra!!");
    }
}
