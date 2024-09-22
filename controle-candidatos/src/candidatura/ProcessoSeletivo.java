package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");

        String[] candidatos = {
            "Pedro",
            "André",
            "Tiago (filho de Zebedeu)",
            "João",
            "Felipe",
            "Bartolomeu",
            "Tomé",
            "Mateus",
            "Tiago (filho de Alfeu)",
            "Tadeu",
            "Simão (o Zelote)",
            "Judas Iscariotes"
        };

        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }
        
    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas <= 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " PORQUE LIGAMOS O NÚMERO MÁXIMO DE " + (tentativasRealizadas - 1) + " TENTATIVAS");
        
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
                "Pedro",
                "André",
                "Tiago (filho de Zebedeu)",
                "João",
                "Felipe",
                "Bartolomeu",
                "Tomé",
                "Mateus",
                "Tiago (filho de Alfeu)",
                "Tadeu",
                "Simão (o Zelote)",
                "Judas Iscariotes"
        };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 7 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou R$" + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                System.out.println("Vagas preenchidas: " + candidatosSelecionados);
            }

            candidatoAtual++;
        }
    }

    static void imprimirSelecionados() {
        String[] candidatos = {
            "Bartolomeu",
            "Tomé",
            "Mateus",
            "Tiago (filho de Alfeu)",
            "Tadeu",
            "Simão (o Zelote)",
            "Judas Iscariotes"
        };

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato de nº " + (i + 1));
            System.out.println(candidatos[i]);
        }

        for (String candidato : candidatos) {
            System.out.println(candidato);
        }
    }
    
    // métodos auxiliares
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
