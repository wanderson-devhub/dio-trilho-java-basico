public class SmartTv {
    boolean estadoDaTv = false;
    int canal = 1;
    int volume = 25;


    public void ligar(){
        estadoDaTv=true;
    }

    public void desligar(){
        estadoDaTv=false;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

}
