/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.adaptor;

import br.edu.ifnmg.adaptor.adapters.OpenGLImageAdapter;
import br.edu.ifnmg.adaptor.adapters.SDLImagemAdapter;
import br.edu.ifnmg.adaptor.imagemtarget.ImagemTarget;

/**
 *
 * @author flawy
 */
public class Adaptor {

    public static void main(String[] args) {
        
        ImagemTarget imagem = new SDLImagemAdapter();
        imagem.carregarImagem("teste.png");
        imagem.desenharImagem(0, 0, 10, 10);
 
        imagem = new OpenGLImageAdapter();
        imagem.carregarImagem("teste.png");
        imagem.desenharImagem(0, 0, 10, 10);
        
    }
}
