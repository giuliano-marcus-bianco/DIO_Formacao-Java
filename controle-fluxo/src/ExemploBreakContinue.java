public class ExemploBreakContinue {
    public static void main(String[] args) {
        System.out.println("Usando break");
        
        for (int numero = 1; numero <= 5; numero++) {
            System.out.println(numero);

            if (numero == 3) {
                break;
            }

        }

        System.out.println("Usando continue");
       
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;
                
                System.out.println(numero);             
            }

        
    }    
}
