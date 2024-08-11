/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.adapter.apis;

/**
 *
 * @author Flavio Santos
 */
public class SDLSurface {
    
    public void SdlCarregarSurface(String arquivo) {
        System.out.println("Imagem " + arquivo + " carregada.");
    }
 
    public void SdlDesenharSurface(int largura, int altura, int posicaoX,
            int posicaoY) {
        System.out.println("SDL_Surface desenhada");
    }

}
