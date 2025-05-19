package clase;

public class ManagementNotifier extends Handler{
    @Override
    public void notifica(Client client) {
        System.out.println("Se notifica managerul: Clientul "+ client.getName() + " nu a oferit date de contact!");
    }
}
