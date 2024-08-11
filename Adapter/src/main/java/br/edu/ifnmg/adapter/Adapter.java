/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.adaptor;

import br.edu.ifnmg.adapter.adapters.OpenGLImageAdapter;
import br.edu.ifnmg.adapter.adapters.SDLImagemAdapter;
import br.edu.ifnmg.adapter.imagemtarget.ImagemTarget;

/**
 *
 * @author flawy
 */
public class Adapter {

    public static void main(String[] args) {
        
        ImagemTarget imagem = new SDLImagemAdapter();
        imagem.carregarImagem("teste.png");
        imagem.desenharImagem(0, 0, 10, 10);
 
        imagem = new OpenGLImageAdapter();
        imagem.carregarImagem("teste.png");
        imagem.desenharImagem(0, 0, 10, 10);
        
    }
}
