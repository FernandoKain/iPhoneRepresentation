package org.example;

public class Main {
    public static void main(String[] args) {

        iPhone2017 iphone = new iPhone2017();

        System.out.println("Testando ReprodutorMusical:");
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Testando o AparelhoTelefonico
        System.out.println("\nTestando AparelhoTelefonico:");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando o NavegadorInternet
        System.out.println("\nTestando NavegadorInternet:");
        iphone.exibirPagina("https://www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}