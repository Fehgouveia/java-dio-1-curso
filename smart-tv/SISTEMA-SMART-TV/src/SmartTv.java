import java.util.Scanner;

public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;
    Scanner scan = new Scanner(System.in);
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(){
        int novoCanal;
        System.out.println("Digite o canal desejado: ");
        novoCanal = scan.nextInt();
        canal = novoCanal;
    }

}
