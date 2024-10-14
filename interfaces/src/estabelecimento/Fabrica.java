package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora deskjet = new DeskJet();
        deskjet.imprimir();

        Impressora laserjet = new LaserJet();
        laserjet.imprimir();

        System.out.println("-------- Utilizando multifuncional --------");

        EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();

        Copiadora copiadora = multifuncional;
        Digitalizadora digitalizadora = multifuncional;
        Impressora impressora = multifuncional;

        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimir();
        
    }
    
}
