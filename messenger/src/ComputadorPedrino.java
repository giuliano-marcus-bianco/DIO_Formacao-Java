import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrino {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        
        System.out.println("-------- MSN --------");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger facebook = new FacebookMessenger();

        System.out.println("-------- Facebook --------");
        facebook.enviarMensagem();
        facebook.receberMensagem();

        Telegram telegram = new Telegram();

        System.out.println("-------- Telegram --------");
        telegram.enviarMensagem();
        telegram.receberMensagem();

        System.out.println("-------- Escolhendo o aplicativo --------");

        ServicoMensagemInstantanea smi = null;
        
        String appEscolhido = "Telegram";

        if (appEscolhido.equals("MSN")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("Facebook")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("Telegram")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();


    }
    
}
