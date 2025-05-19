package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Client ioana = new Client("Ioana", "0723456788", null);
        Client gigel = new Client("Gigel", null, "gigel@yahoo.com");
        Client mihai = new Client("Mihai", null, null);

        Handler sms = new SMSNotifier();
        Handler email = new EmailNotifier();
        Handler management = new ManagementNotifier();

        sms.setUrmatorul(email);
        email.setUrmatorul(management);

        sms.notifica(ioana);
        sms.notifica(gigel);
        sms.notifica(mihai);
    }
}
