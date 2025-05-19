package clase;

public class EmailNotifier extends Handler{
    @Override
    public void notifica(Client client) {
        if(client.getEmail() != null){
            System.out.println("[Notificare email]: " + client.getName()+ ", a aparut o noua oferta!");
        }else {
            this.urmatorul.notifica(client);
        }
    }
}
