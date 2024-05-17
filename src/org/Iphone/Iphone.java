package org.Iphone;

import org.Iphone.Functions.AparelhoTelefonico;
import org.Iphone.Functions.NavegadorNaInternet;
import org.Iphone.Functions.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    private String modelo;
    private String numeroSerie;
    private String estadoReprodutor;
    private String estadoTelefone;
    private String estadoNavegador;

    public Iphone(String modelo, String numeroSerie){
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.estadoReprodutor = "Parado";
        this.estadoTelefone = "Desligado";
        this.estadoNavegador = "Fechado";
    }


    @Override
    public void tocar() {
        estadoReprodutor = "tocando";
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        estadoReprodutor = "pausado";
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }


    @Override
    public void ligar(String numero) {

        estadoTelefone = "chamando";
        System.out.println("Ligando para " + numero);    }

    @Override
    public void atender() {
        estadoTelefone = "em chamada";
        System.out.println("Atendendo chamada.");    }

    @Override
    public void iniciarCorreioVoz() {
        estadoTelefone = "correio de voz";
        System.out.println("Iniciando correio de voz.");    }


    @Override
    public void exibirPagina(String url) {
        estadoNavegador = "exibindo página";
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

}
