public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Estado da TV: " + smartTv.estadoDaTv);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println(smartTv.estadoDaTv);

        smartTv.desligar();
        System.out.println(smartTv.estadoDaTv);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println(smartTv.volume);

        smartTv.aumentarCanal();

        System.out.println(smartTv.canal);

        smartTv.mudarCanal(12);

        System.out.println(smartTv.canal);
    }
}
