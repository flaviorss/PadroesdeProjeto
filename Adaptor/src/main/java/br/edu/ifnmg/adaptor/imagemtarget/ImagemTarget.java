/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.adaptor.imagemtarget;

/**
 *
 * @author flawy
 */
public interface ImagemTarget {
    
    void carregarImagem(String nomeDoArquivo);
    void desenharImagem(int posX, int posY, int largura, int altura);
    
}
