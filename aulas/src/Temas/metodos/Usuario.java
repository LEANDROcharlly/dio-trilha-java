package Temas.metodos;

public class Usuario {
    public static void main(String[] args){
        
        System.out.println();

        SmartTv smartTv = new SmartTv();

        System.out.println("tv ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

        System.out.println();

        smartTv.ligar();
        System.out.println("Status atual da TV: " + smartTv.ligada);

        System.out.println();

        smartTv.desligar();
        System.out.println("Status atual da TV: " + smartTv.ligada);

        System.out.println();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println();

        smartTv.mudarCanal(30);
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println();

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println();
    }
}
