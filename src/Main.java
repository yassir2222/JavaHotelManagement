import entities.Client;
import service.ClientService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client C = new Client("nom","prenom","06000000","gemail");
        ClientService sc = new ClientService();
        sc.create(C);
    }
}