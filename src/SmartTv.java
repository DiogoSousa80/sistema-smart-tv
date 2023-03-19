public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal ( int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        System.out.println("Aumentando o volume para: " + volume);
        volume ++;
    }
    public void dimimuirVolume(){
        System.out.println("Diminindo o volume para: " + volume);
        volume --;
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada = false;
    }
}
