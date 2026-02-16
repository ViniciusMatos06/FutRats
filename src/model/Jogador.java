package model;

public class Jogador {

//atributos
    private String namePlayer;
    private int golsMarcados = 0 ; // 3 pontos por gol
    private int assistenciasFeitas = 0; // 2 pontos por assist
    private int jogosJogados = 0;
    private int vitoriasJogador = 0; // quantidade de partidas ganhas
    private int derrotasJogador = 0; // quantidade de partidas perdidas
    private int pontosJogador = 0 ;

    //================================================================
    //construtor

    public Jogador(String namePlayer){
        this.namePlayer = namePlayer;
    }



//=======================================================================================================================

//Métodos

    public int getPontosJogador() {
        return pontosJogador;
    }

    public int getJogosJogados() {
        return jogosJogados;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public int getAssistenciasFeitas() {
        return assistenciasFeitas;
    }

    public int getVitoriasJogador() {
        return vitoriasJogador;
    }

    public int getDerrotasJogador() {
        return derrotasJogador;
    }




//=======================================================================================================
// Funções

    public double calculaMediaGols () {
        if (jogosJogados==0){
            return 0;
        }
        return (double) golsMarcados/jogosJogados;
    }
}
