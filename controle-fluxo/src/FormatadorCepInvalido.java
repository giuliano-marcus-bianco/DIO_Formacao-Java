public class FormatadorCepInvalido {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("8804040");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O cep precisa ter 8 dígitos.");
        }
    };

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8) {
            throw new CepInvalidException();
        }        

        // simulando um cep formatado
        return "88.040-400";
        };        
};

