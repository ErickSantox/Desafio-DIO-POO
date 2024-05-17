package org.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone myIphone = new Iphone("12","ABCDEXADSF");


        //Reprodutor musical
        System.out.println("\n" +
                "Reprodutor musical");
        myIphone.selecionarMusica("Feel it - d4vd");
        myIphone.tocar();
        myIphone.pausar();

        //Aparelho telefonico
        System.out.println("\n" +
                "Aparelho telefonico");
        myIphone.ligar("40028922");
        myIphone.iniciarCorreioVoz();
        myIphone.atender();

        //Navegador Na Internet
        System.out.println("\n" +
                "Navegador Na Internet ");
        myIphone.exibirPagina("https://web.dio.me/track/santander-2024-backend-com-java");
        myIphone.adicionarNovaAba();
        myIphone.atualizarPagina();
    }
}