/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.adaptor.apis;

/**
 *
 * @author Flavio Santos
 */
public class OpenGLImage {
    
    public void glCarregarImagem(String arquivo) {
        System.out.println("Imagem " + arquivo + " carregada.");
    }
 
    public void glDesenharImagem(int posicaoX, int posicaoY) {
        System.out.println("OpenGL Image desenhada");
    }
    
}
