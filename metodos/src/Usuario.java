public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        
        System.out.println("------------------------------");
        
        smartTv.ligar();
        System.out.println("Tv ligada: " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Tv ligada: " + smartTv.ligada);
        
        System.out.println("------------------------------");
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        
        System.out.println("------------------------------");
        
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        
        System.out.println("Canal: " + smartTv.canal);
        
        smartTv.retrocederCanal();
        smartTv.retrocederCanal();
        
        System.out.println("Canal: " + smartTv.canal);
        
        smartTv.mudarCanal(45);
        
        System.out.println("Canal: " + smartTv.canal);
    }
}
