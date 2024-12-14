package com.apple.model;

import com.apple.service.AparelhoTelefonico;
import com.apple.service.NavegadorInternet;
import com.apple.service.ReprodutorMusica;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {

    String numero;

    public void ligar(String numero) {
        this.numero = numero;

        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Deixe um recado após o sinal");
    }

    String url;

    public void exibirPagina(String url) {
        this.url = url;

        System.out.println("Acessando a página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página " + url);
    }

    String musica;

    public void selecionarMusica(String musica) {
        this.musica = musica;

        System.out.println("Música " + musica + " selecionada");
    }
    
    public void tocar() {
        System.out.println("Tocando " + musica);
    }

    public void pausar() {
        System.out.println("Pausando música");
    }
}
