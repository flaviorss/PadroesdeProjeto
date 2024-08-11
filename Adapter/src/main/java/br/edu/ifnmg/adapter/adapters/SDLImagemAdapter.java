/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.adaptor.adapters;

import br.edu.ifnmg.adapter.apis.SDLSurface;
import br.edu.ifnmg.adapter.imagemtarget.ImagemTarget;

/**
 *
 * @author Flavio Santos
 */
public class SDLImagemAdapter extends SDLSurface implements ImagemTarget {
    
    @Override
    public void carregarImagem(String nomeDoArquivo) {
        SdlCarregarSurface(nomeDoArquivo);
    }
 
    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        SdlDesenharSurface(largura, altura, posX, posY);
    }
    
}
