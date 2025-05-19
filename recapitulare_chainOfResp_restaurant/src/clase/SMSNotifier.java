package clase;

public class SMSNotifier extends Handler {
    @Override
    public void notifica(Client client) {
        if(client.getNrTelefon() != null){
            System.out.println("[Notificare SMS]: " + client.getName()+ ", a aparut o noua oferta!");
        }else {
            this.urmatorul.notifica(client);
        }
    }
}
