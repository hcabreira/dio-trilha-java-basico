public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.dominuirVolume();
        smartTv.dominuirVolume();
        System.out.println("Canal atual " +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual " +smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual " +smartTv.canal);
        System.out.println("Volume atual? " +smartTv.volumue);

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        

    }
}
