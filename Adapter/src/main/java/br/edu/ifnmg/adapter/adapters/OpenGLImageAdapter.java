/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.adapter.adapters;

import br.edu.ifnmg.adapter.apis.OpenGLImage;
import br.edu.ifnmg.adapter.imagemtarget.ImagemTarget;

/**
 *
 * @author Flavio Santos
 */
public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget{
    
    @Override
    public void carregarImagem(String nomeDoArquivo) {
        glCarregarImagem(nomeDoArquivo);
    }
 
    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        glDesenharImagem(posX, posY);
    }

}
