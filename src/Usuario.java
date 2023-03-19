public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        smartTv.dimimuirVolume();
        smartTv.dimimuirVolume();
        smartTv.dimimuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(22);
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
    }
}