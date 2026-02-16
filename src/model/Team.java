package model;

import java.util.ArrayList;

public class Team {

   private ArrayList<Jogador> listaJogadoresTime = new ArrayList<Jogador>();


    private String nomeTime;
    private int pontosTime;
    private int numeroDeJogosTime;
    private int vitoriasTime;
    private int derrotasTime;
    private int golsMarcados;
    private int golsSofridos;

//===================================================================
    // metodos
    public String getNomeTime() {
        return nomeTime;
    }
    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }
    public int getDerrotasTime() {
        return derrotasTime;
    }
    public int getVitoriasTime() {
        return vitoriasTime;
    }
    public int getPontosTime() {
        return pontosTime;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public int getNumeroDeJogosTime() {
        return numeroDeJogosTime;
    }
// =================================================================================
    // Funções

    public int calculaSaldoGols () {
       return golsMarcados - golsSofridos;
    }

    public void adicionarJogador(Jogador jogador) {

        if (jogador == null) {
            throw new IllegalArgumentException("Jogador não pode ser nulo");
        }

        if (!listaJogadoresTime.contains(jogador)) { // verifica se o jogador ja está no time
            listaJogadoresTime.add(jogador);
        }
    }

    public void removerJogador(Jogador jogador) {

        if (jogador == null) {
            throw new IllegalArgumentException("Jogador não pode ser nulo");
        }

        listaJogadoresTime.remove(jogador);
    }
    public void mostrarJogadores() {

        if (listaJogadoresTime.isEmpty()) {
            System.out.println("Nenhum jogador no time.");
            return;
        }

        for (Jogador jogador : listaJogadoresTime) {
            System.out.println(jogador.getNamePlayer());
        }
    }


    }
