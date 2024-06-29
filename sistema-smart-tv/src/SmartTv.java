public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volumue = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarVolume(){
        volumue ++; // equivalente volume + 1
    }
    public void dominuirVolume(){
        volumue --; // equivalente volume - 1
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}