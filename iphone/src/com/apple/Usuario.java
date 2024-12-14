package com.apple;

import com.apple.model.Iphone;

public class Usuario extends Iphone{
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("My way");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("11 9 8765-4321");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.dio.me");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}
