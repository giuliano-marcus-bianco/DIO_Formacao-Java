public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; // As opções são BASIC ("B"), MÉDIO ("M") e TURBO ("T")

        // Utilizando condicional encadeada
        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5Gb de YouTube");
        }

        // Utilizando o switch case
        switch (plano) {
            case "T":
                System.out.println("5Gb de YouTube");
            case "M":
                System.out.println("WhatsApp e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
        }
    }
}
